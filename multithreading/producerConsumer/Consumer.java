package producerConsumer;

public class Consumer<K> implements Runnable {
    private Resource<K> resource;
    private K item;
    Consumer (Resource<K> resource) {
        this.resource = resource;
    }
    @Override
    public void run() {
        try {
            this.item = resource.consumeItem();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
