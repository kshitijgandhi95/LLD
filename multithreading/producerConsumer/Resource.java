package producerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class Resource<K> {
    private int capacity;
    private Queue<K> buffer;

    Resource (int capacity) {
        this.capacity = capacity;
        this.buffer = new LinkedList<K>();
    }

    public synchronized void addItem (K item) throws InterruptedException {
        while (buffer.size() == this.capacity) {
            System.out.println("Buffer is full, waiting " + Thread.currentThread().getName());
            wait();
        }
        Thread.sleep(1000);
        buffer.add(item);
        System.out.println("Item produced " + item.toString() + " by " + Thread.currentThread().getName());
        notifyAll();
        return;
    }

    public synchronized K consumeItem () throws InterruptedException {
        while (buffer.size() == 0) {
            System.out.println("Buffer is empty, waiting for item to be produced "  + Thread.currentThread().getName());
            wait();
        }
        Thread.sleep (1000);
        K item = buffer.peek();
        System.out.println("Item consumed " + item.toString() + " " + Thread.currentThread().getName());
        buffer.remove();
        notifyAll();
        return item;
    }
}
