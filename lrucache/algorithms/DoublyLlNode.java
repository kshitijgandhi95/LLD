package lrucache.algorithms;

public class DoublyLlNode <K> {
    DoublyLlNode <K> next;
    DoublyLlNode <K> previous;
    K element;
    public DoublyLlNode(K element) {
        this.element = element;
        this.previous = null;
        this.next = null;
    }

    public K getElement() {
        return this.element;
    }
}
