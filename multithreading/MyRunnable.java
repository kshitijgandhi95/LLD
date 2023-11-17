public class MyRunnable implements Runnable {

    @Override
    public void run() {
        // Code to be executed in the thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName() + " Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Create an instance of the class that implements Runnable
        MyRunnable myRunnable = new MyRunnable();

        // Create a Thread using the Runnable instance
        Thread thread = new Thread(myRunnable);

        // Start the thread
        thread.start();

        // Code in the main method (this will be executed by the main thread)
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: Count: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}