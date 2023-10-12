package lrucache.models;

import java.util.Map;

public class HashMapStorage<Key, Value> implements Storage<Key, Value>{
    private int MAX_CAPACITY;
    Map<Key, Value> data;
    @Override
    public boolean isFull() {
        if (data.size() >= this.MAX_CAPACITY) {
            return true;
        }
        return false;
    }

    @Override
    public void add(Key k, Value v) {
        if (this.isFull()) {
            throw new Error("Capacity Full");
        }
        data.put(k, v);
    }

    @Override
    public Value get(Key k) {
        if (data.containsKey(k)) {
            return data.get(k);
        }
        return null;
    }

    @Override
    public void remove(Key k) {
        if (data.containsKey(k)) {
            data.remove(k);
        }
        throw new Error("No such Key present");
    }
    
}
