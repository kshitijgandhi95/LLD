package StampedLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.StampedLock;

public class Main {
    public static void main(String[] args) {
        StampedLock lock = new StampedLock();
        // SharedResource r1 = new SharedResource();
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
            r2.consumerUsingOptmisticLocking(lock);
        }, "write 3");

        Thread t5 = new Thread(() -> {
            r2.consumerUsingOptmisticLocking(lock);
        }, "write 4");

        Thread t6 = new Thread(() -> {
            r2.consumerUsingOptmisticLocking(lock);
        }, "write 5");


        t1.start();
        t2.start();
        t3.start();

        t4.start();
        t5.start();
        t6.start();
    }
}