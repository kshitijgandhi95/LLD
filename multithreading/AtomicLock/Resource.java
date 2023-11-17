package AtomicLock;

public class Resource {
    int i = 0;

    public void updateValue() {
        this.i++;
    }
}
