package ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {
        ReadWriteLock lock = new ReentrantReadWriteLock();
        Resource r1 = new Resource();
        SharedResource r2 = new SharedResource();

        Thread t1 = new Thread(()-> {
            r2.producer(lock);
        }, "read 1");

        Thread t2 = new Thread(() -> {
            r2.producer(lock);
        }, "read 2");

        Thread t3 = new Thread(() -> {
            r2.consumer(lock);
        }, "write 1");

        Thread t4 = new Thread(()-> {
            r1.readResource(lock);
        }, "read 3");

        Thread t5 = new Thread(() -> {
            r1.readResource(lock);
        }, "read 4");

        Thread t6 = new Thread(() -> {
            r2.consumer(lock);
        }, "write 5");

        t1.start();
        t2.start();
        t3.start();

        t4.start();
        t5.start();
        t6.start();
    }
}
