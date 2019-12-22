package core_java;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyLock {

    Lock lock;
    int amount = 1000;

    MyLock(){
        lock = new ReentrantLock();
    }
    public static void main(String[] args) {

        MyLock myatm = new MyLock();

        System.out.println(myatm.deposit(100));

        System.out.println(myatm.withdraw(500));

    }

    public int deposit(int val){

        lock.lock();//lock resource here
        int balance = amount;
        try {
            Thread.sleep(1000);
            balance += val;
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        amount = balance;
        lock.unlock();

        return balance;
    }


    public int withdraw(int val){

        lock.lock();//lock resource here
        int balance = amount;
        try {
            Thread.sleep(1000);
            balance -= val;
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        amount = balance;
        lock.unlock();

        return balance;
    }
}
