package Volatile;

public class Test1 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();

        try {
            Thread.sleep(2000); // main thread is taking 2sec sleep
        }
        catch (InterruptedException e) {
            // TODO: handle exception
        }
        t1.stopping();
    }
}


// for every thread there OS is created and every OS have a cache

// main thread -> OS -> cache -|
//                             |   -> RAM
// t1 thread   -> OS -> cache -|

// Visibility: Any write to that variable by one thread is immediately visible to all other threads.
// Prevents Caching: Threads always read from main memory, not a cached version.

// therefore we use volatile keyword
//  volatile prevents caching, ensuring that memory reads/writes go straight to the shared heap, not just per-thread CPU cache.