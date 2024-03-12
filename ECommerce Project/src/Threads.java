import java.util.concurrent.TimeUnit;
class MyThread extends Thread {
    private volatile boolean stopped = false;
    public void run() {
        try {
            while (!stopped) {
                System.out.println("Thread is running");
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted by InterruptedException");
        } finally {
            System.out.println("Thread cleanup");
        }
    }
    public void stopThread() {
        System.out.println("Stopping the thread");
        stopped = true;
    }
}
public class Threads {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            TimeUnit.SECONDS.sleep(5);
            myThread.stopThread();
            myThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main program interrupted by InterruptedException");
        }
    }
}
