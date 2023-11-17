package producerConsumer;

public class Main {
    public static void main(String[] args) {
        Resource<Integer> resource = new Resource<>(3);
        Producer<Integer> p1  = new Producer<Integer>(resource, 1);
        Producer<Integer> p2 = new Producer<Integer>(resource, 2);
        Consumer<Integer> c1 = new Consumer<>(resource);
        Consumer<Integer> c2 = new Consumer<>(resource);
        Consumer<Integer> c3 = new Consumer<>(resource);
        Consumer<Integer> c4 = new Consumer<>(resource);
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(c1);
        Thread t4 = new Thread(c2);
        Thread t5 = new Thread(c3);
        Thread t6 = new Thread(c4);
        t3.start();
        t1.start();
        Thread t7 = new Thread(() -> {
            try {
                resource.consumeItem();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        t7.start();
        t2.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
