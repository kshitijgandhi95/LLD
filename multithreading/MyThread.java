public class MyThread extends Thread {

    // Override the run method to define the thread's behavior
    @Override
    public void run() {
        // Code to be executed in the thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName() + " Count: " + i);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the class that extends Thread
        MyThread myThread = new MyThread();

        // Start the thread using the start method
        myThread.start();

        // Code in the main method (this will be executed by the main thread)
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: Count: " + i + " " + Thread.currentThread().getName());
        }
    }
}
