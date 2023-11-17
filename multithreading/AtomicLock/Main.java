package AtomicLock;

public class Main {
    public static void main(String[] args) {
        Resource r = new Resource();

        Thread t1 = new Thread(() -> {
            for (int i=0; i<20000; i++) {
                r.updateValue();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i=0; i<20000; i++) {
                r.updateValue();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally{
            System.out.println("resource value " + r.i);
        }

    }
}
