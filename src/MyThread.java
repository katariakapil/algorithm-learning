import java.util.concurrent.*;

public class MyThread extends  Thread {


    public void run(){

        int i =0;
        while (i <100000) {
            i++;
            System.out.println("running here..."+ this.getName());
        }
    }

    public static void main(String[] args) {


/*
            MyThread t = new MyThread();
            MyThread t2 = new MyThread();
            MyThread t3 = new MyThread();

            System.out.println(t.getName());
            System.out.println(t2.getName());
            System.out.println(t3.getName());

            t.start();t2.start();t3.start();
*/

       // ExecutorService task = Executors.newSingleThreadExecutor();
        ExecutorService task = Executors.newFixedThreadPool(10);
        ExecutorService task2 = Executors.newSingleThreadExecutor();
        Future future = task.submit(new Runnable() {
            @Override
            public void run() {
                int i =0;
                while (i <10) {
                    i++;
                    System.out.println("running here..." + Thread.currentThread().getName());
                }
            }
        });

        //this is for returning result.
        Future future2 = task2.submit(new Callable<Object>() {
            @Override
            public String call() {
                int i =0;
                while (i <11) {
                    i++;
                    System.out.println("TASk here...");
                }
                return "completed";
            }
        });

        try {
            System.out.println(future2.get());//// returns null if the task has finished correctly.
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        task.shutdown();

    }
}
