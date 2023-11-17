package ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;

public class Resource {
    private boolean isAvailable = false;

    public boolean readResource(ReadWriteLock rLock) {
        rLock.readLock().lock();
        boolean retVal;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally{
            System.out.println("Value read by " + Thread.currentThread().getName());
            retVal = this.isAvailable;
            rLock.readLock().unlock();
        }
        return retVal; 
    }

    public void updateResource (ReadWriteLock lock, boolean val) {
        lock.writeLock().lock();
        this.isAvailable = val;
        try {
            Thread.sleep(5000);
            System.out.println("Value updated by " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally {
            lock.writeLock().unlock();;
        }
        return;
    }
}
