package Volatile;

public class Thread1 extends Thread{
    volatile boolean running = true;
    public void run() {
        System.out.println("Thread started");
        while (running) {

        }
        System.out.println("Thread stopped");
    }
    public void stopping() {
        running = false;
    }
}
