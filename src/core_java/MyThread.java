package core_java;

public class MyThread implements Runnable{

    //Using volatile is yet another way (like synchronized, atomic wrapper) of making class thread safe.
    // Thread safe means that a method or class instance can be used by multiple
    // threads at the same time without any problem.

    private volatile boolean exit = false;
    int i = 0;
    // we cannot change signature here since we need to implement abstract method from runnable interface
    public void run (){

        while(!exit) {
            System.out.println("Running...."+i++);
        }

        System.out.println("Finished running...");
    }//1161979

    public void stop(){
        exit = true;
    }

    public static void main(String[] args) {

        MyThread th = new MyThread();

        Thread thread = new Thread(th); //pass the instance of your runnable class. By implementing the runnable interface
        // we have converted our class as runnable object.

        thread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        th.stop();


    }
}
