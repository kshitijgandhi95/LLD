package producerConsumer;

public class Producer <K> implements Runnable{
    private Resource<K> resource;
    private K item;
    Producer (Resource<K> resource, K item) {
        this.resource = resource;
        this.item = item;
    }

    @Override
    public void run() {
        try {
            resource.addItem(item);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
