package Synchronization;

public class Test {
    static int count = 0;

/*
    public static void counter() {
        count++;
    }
*/

    // therefore we will use synchronization
    // when the thread enters the counter method it will lock the other thread to enter the counter method
    // therefore the counter will not give random output
    public static void counter() {
        count++;
    }
    public static synchronized void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
        try { // we need to use try catch because join() can give interrupted exception that is a checked exception
            t1.join();
            t2.join();
        }
        catch (InterruptedException err) {
            System.out.println("thread is interrupted");
        }
        System.out.println(count); // value of count is random
        // because 2 threads are running simultaneously
        // lets count = 100
        // and there is case when both the thread are running same time
        // then t1 will increase the count to 101
        // and t2 will also increase the count to 101
        // therefore the count = 101
        // therefore every time thread is running it will give random count
    }
}