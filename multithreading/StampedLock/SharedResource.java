package StampedLock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    boolean isAvailable = false;
    public void producer (StampedLock lock) {
        long stamp = lock.readLock();
        try {
            
            System.out.println("Lock acquired by " + Thread.currentThread().getName());
            Thread.sleep(5000);
            
        }
        catch(InterruptedException e) {
            System.out.println("error " + e.toString());
        }
        finally{
            lock.unlockRead(stamp);
            System.out.println("Lock released by " + Thread.currentThread().getName());
        }
    }
    
    public void consumer (StampedLock lock) {
        long stamp = lock.writeLock();
        try {
            
            System.out.println("Lock acquired by " + Thread.currentThread().getName());
            Thread.sleep(5000);
            
        }
        catch(InterruptedException e) {
            System.out.println("error " + e.toString());
        }
        finally{
            lock.unlockWrite(stamp);
            System.out.println("Lock released by " + Thread.currentThread().getName());
        }
    }

    public void consumerUsingOptmisticLocking (StampedLock lock) {
        long stamp = lock.tryOptimisticRead();
        try {
            Thread.sleep(5000);
            if (lock.validate(stamp)) {
                System.out.println("Value updated by " + Thread.currentThread().getName());
            }
            else {
                System.out.println("Rollback " + Thread.currentThread().getName());
            }
        }
        catch(InterruptedException e) {
            System.out.println("error " + e.toString());
        }
    }
}