package lrucache.factories;

import lrucache.models.Cache;
import lrucache.models.HashMapStorage;
import lrucache.models.LruEvictionPolicy;

public class CacheFactory<Key, Value> {
    public Cache<Key, Value> defaultCache(final int capacity) {
        return new Cache<Key, Value>(new LruEvictionPolicy<Key>(),
                new HashMapStorage<Key, Value>());
    }
}
