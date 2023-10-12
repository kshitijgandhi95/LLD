package lrucache.models;

public interface Storage<Key, Value> {
    public boolean isFull ();
    public void add (Key k, Value v);
    public Value get (Key k);
    public void remove (Key k);
}
