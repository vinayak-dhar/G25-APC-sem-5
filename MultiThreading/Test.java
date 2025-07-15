package MultiThreading;

public class Test {
    public static void main(String[] args) {
        MyThread t = new MyThread(); // creation of 1 thread
        // t.run(); this will run as a normal method not as a thread and run simultaneously
        t.start(); // with this both thread will execute simultaneously -> that is main thread and the MyThread thread

        // thread will only execute once we cannot write t.start() again
        // or create new object then use .start() to run the thread

        try {
            // it will increase the priority of the child and decrease the priority of the parent class
            // therefore 1st all the child class will be printed than parent class will be printed
            t.join(); // 1st it will run
        }
        catch (InterruptedException e) {
            System.out.println("hello");
        }

        for (int i=0; i<10; i++) {
            System.out.println("parent class");
//            try {
//                // cant use this without try catch
//                Thread.sleep(5000);
//            }
//            catch (InterruptedException e) {
//                System.out.println("hello");
//            }
        }
    }
}


// whenever more than 2 threads executed simultaneously the output is random