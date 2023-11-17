package Semaphore;

import java.util.concurrent.Semaphore;

public class SharedResource {
    boolean isAvailable = false;
    public void producer (Semaphore lock) {
        try {
            lock.acquire();    
            System.out.println("Lock acquired by " + Thread.currentThread().getName());
            Thread.sleep(5000);
            
        }
        catch(InterruptedException e) {
            System.out.println("error " + e.toString());
        }
        finally{
            lock.release();
            System.out.println("Lock released by " + Thread.currentThread().getName());
        }
    }
    
    // public void consumer (Semaphore lock) {
    //     long stamp = lock.writeLock();
    //     try {
            
    //         System.out.println("Lock acquired by " + Thread.currentThread().getName());
    //         Thread.sleep(5000);
            
    //     }
    //     catch(InterruptedException e) {
    //         System.out.println("error " + e.toString());
    //     }
    //     finally{
    //         lock.unlockWrite(stamp);
    //         System.out.println("Lock released by " + Thread.currentThread().getName());
    //     }
    // }

    // public void consumerUsingOptmisticLocking (Semaphore lock) {
    //     long stamp = lock.tryOptimisticRead();
    //     try {
    //         Thread.sleep(5000);
    //         if (lock.validate(stamp)) {
    //             System.out.println("Value updated by " + Thread.currentThread().getName());
    //         }
    //         else {
    //             System.out.println("Rollback " + Thread.currentThread().getName());
    //         }
    //     }
    //     catch(InterruptedException e) {
    //         System.out.println("error " + e.toString());
    //     }
    // }
}