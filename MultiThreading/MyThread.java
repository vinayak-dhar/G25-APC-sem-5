package MultiThreading;

public class MyThread extends Thread {
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println("child class");
            Thread.yield();
        }
    }
}

// if we want to run code in a thread we have to put that code inside run method in thread class
