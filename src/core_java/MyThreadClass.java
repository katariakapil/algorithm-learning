package core_java;

public class MyThreadClass extends Thread {

    volatile boolean exit = false;

    public static void main(String[] args) throws InterruptedException{


        MyThreadClass thread = new MyThreadClass();
        thread.start();

        Thread.sleep(5000);

        thread.stopThread();//this our custom stop method , stop method from thread class is depereciated

    }

    public void run(){

        while (!exit) {
            System.out.println("Running...");
        }

        System.out.println("done");
    }

    public void stopThread(){
        exit = true;
    }
}
