import java.util.TimerTask;

public class MyThreadTest implements  Runnable {

    public void run() {

        while (true) {

            System.out.println("keep it running..");

        }


    }


    private char[] monitor = new char[0];

    protected class QThread extends TimerTask {


        public void run() {


            // notify the consumer thread to start polling the queue again
            MyThreadTest.this.monitor.notifyAll();


        }
    }
}
