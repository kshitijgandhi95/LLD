package AtomicLock;

import java.util.concurrent.atomic.AtomicInteger;

public class ResourceUsingAtomicInteger {
    AtomicInteger i = new AtomicInteger();

    public void updateValue() {
        i.incrementAndGet();
    }
}
