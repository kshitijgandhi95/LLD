public class MonitorLocks {
    private int instanceCounter = 0;
    public synchronized void functionOne () {
        for (int i=0; i<5; i++) {
            instanceCounter++;
            System.out.println("Incrementing shared resource " + instanceCounter + " by " + Thread.currentThread().getName());
        }
        try {
            Thread.sleep(100);
        } 
        catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void functionTwo () {
        System.out.println("Function two will be printed regardless of monitoring lock " + Thread.currentThread().getName());
        synchronized (this) {
            System.out.println("Should be printed after function one ");
        }
    }

    public static void main(String[] args) {
        MonitorLocks mLocks = new MonitorLocks();
        Thread thread1 = new Thread(() -> {
            mLocks.functionOne();
        });
        Thread thread2 = new Thread(() -> {
            mLocks.functionTwo();
        });
        thread1.start();
        thread2.start();
    }
}


