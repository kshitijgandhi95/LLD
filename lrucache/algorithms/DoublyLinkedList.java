package lrucache.algorithms;

public class DoublyLinkedList <Key> {
    DoublyLlNode<Key> head;
    DoublyLlNode<Key> tail;

    public DoublyLinkedList () {
        this.head = new DoublyLlNode<>(null);
        this.tail = new DoublyLlNode<>(null);
        head.next = tail;
        tail.previous = head;
    }

    public void addNodeAtTail (DoublyLlNode<Key> node) {
        DoublyLlNode<Key> prev = tail.previous;
        prev.next = node;
        node.next = tail;
        node.previous = prev;
        tail.previous = node;
    }

    DoublyLlNode<Key> deleteNodeAtTail () {
        if (tail.previous == head) {
            return null;
        }
        DoublyLlNode<Key> prev = tail.previous;
        prev.previous.next = tail;
        tail.previous = prev.previous;
        prev.next = null;
        prev.previous = null;
        return prev;
    }

    public DoublyLlNode<Key> deleteNodeAtHead () {
        if (head.next == null) {
            return null;
        }
        DoublyLlNode<Key> next = head.next;
        head.next = next.next;
        next.next.previous = head;
        next.previous = null;
        next.next = null;
        return next;
    }

    public DoublyLlNode<Key> detachNode (DoublyLlNode<Key> node) {
        if (node != null) {
            node.previous.next = node.next;
            node.next.previous = node.previous;
        }
        return node;
    }
}
