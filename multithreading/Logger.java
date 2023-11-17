public class Logger {
    private boolean isRunning;
    private Thread loggingThread;

    public Logger() {
        isRunning = false;
        loggingThread = new Thread(this::runLogging);
        loggingThread.setDaemon(true); // Set the thread as daemon
    }

    public void startLogging() {
        if (!isRunning) {
            isRunning = true;
            loggingThread.start();
        } else {
            System.out.println("Logging is already running. " + Thread.currentThread().getName());
        }
    }

    public void stopLogging() {
        isRunning = false;
    }

    private void runLogging() {
        while (isRunning) {
            // Your logging logic here
            System.out.println("Logging information..." + Thread.currentThread().getName());

            try {
                // Simulate logging delay
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.startLogging();
        System.out.println("Thread name " + Thread.currentThread().getName());
        // Simulate some other activity running in the main thread
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        logger.stopLogging();
    }
}
