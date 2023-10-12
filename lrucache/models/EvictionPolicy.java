package lrucache.models;

public interface EvictionPolicy <Key> {
    void updateOnAccess (Key k);
    Key evict();
}
