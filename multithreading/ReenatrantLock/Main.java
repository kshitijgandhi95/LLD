package ReenatrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Resource r1 = new Resource();
        Resource r2 = new Resource();

        Thread t1 = new Thread(()-> {
            r1.readResource(lock);
        });

        Thread t2 = new Thread(() -> {
            r2.readResource(lock);
        });

        t1.start();
        t2.start();
    }
}
