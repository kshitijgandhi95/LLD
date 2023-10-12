package lrucache.models;

import java.util.Map;

import lrucache.algorithms.DoublyLinkedList;
import lrucache.algorithms.DoublyLlNode;

public class LruEvictionPolicy<Key> implements EvictionPolicy<Key>{
    DoublyLinkedList<Key> dll;
    Map<Key,DoublyLlNode<Key>> address;

    public LruEvictionPolicy () {
        this.dll = new DoublyLinkedList<>();
    }
    @Override
    public void updateOnAccess(Key k) {
        if (!address.containsKey(k)) {
            DoublyLlNode<Key> node = new DoublyLlNode<>(k);
            dll.addNodeAtTail(node);
            address.put(k, node);
            return;
        }
        DoublyLlNode<Key> node = address.get(k);
        dll.detachNode(node);
        dll.addNodeAtTail(node);
    }

    @Override
    public Key evict() {
        DoublyLlNode<Key> node = dll.deleteNodeAtHead();
        if (node == null) {
            return null;
        }
        return node.getElement();
    }
    
}
