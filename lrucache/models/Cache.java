package lrucache.models;

public class Cache<Key, Value> {
    Storage<Key, Value> storage;
    EvictionPolicy<Key> evictionPolicy;

    public Cache(EvictionPolicy<Key> evictionPolicy, Storage<Key, Value> storage) {
        this.evictionPolicy = evictionPolicy;
        this.storage = storage;
    }

    public void put (Key key, Value value) {
        try {
            this.storage.add (key, value);
            this.evictionPolicy.updateOnAccess(key);
        }
        catch (Error error) {
            Key keyToRemove = evictionPolicy.evict();
            storage.remove(keyToRemove);
            put (key, value);
        }  
    }

    public Value get(Key key) {
        try {
            Value value = this.storage.get(key);
            this.evictionPolicy.updateOnAccess(key);
            return value;
        } catch (Error error) {
            System.out.println("Tried to access non-existing key.");
            return null;
        }
    }
}
