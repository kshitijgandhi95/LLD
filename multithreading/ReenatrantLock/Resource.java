package ReenatrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Resource {
    private boolean isAvailable = false;

    public boolean readResource(ReentrantLock rLock) {
        rLock.lock();
        boolean retVal;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally{
            System.out.println("Value read by " + Thread.currentThread().getName());
            retVal = this.isAvailable;
            rLock.unlock();
        }
        return retVal; 
    }

    public void updateResource (ReentrantLock lock, boolean val) {
        lock.lock();
        this.isAvailable = val;
        try {
            Thread.sleep(1000);
            System.out.println("Value updated by " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
        return;
    }
}
