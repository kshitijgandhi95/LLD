package ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {
    boolean isAvailable = false;
    public void producer (ReadWriteLock lock) {
        try {
            lock.readLock().lock();
            System.out.println("Lock acquired by " + Thread.currentThread().getName());
            Thread.sleep(5000);
            
        }
        catch(InterruptedException e) {
            System.out.println("error " + e.toString());
        }
        finally{
            lock.readLock().unlock();
            System.out.println("Lock released by " + Thread.currentThread().getName());
        }
    }
    
    public void consumer (ReadWriteLock lock) {
        try {
            lock.writeLock().lock();
            System.out.println("Lock acquired by " + Thread.currentThread().getName());
            Thread.sleep(5000);
            
        }
        catch(InterruptedException e) {
            System.out.println("error " + e.toString());
        }
        finally{
            lock.writeLock().unlock();
            System.out.println("Lock released by " + Thread.currentThread().getName());
        }
    }
}
