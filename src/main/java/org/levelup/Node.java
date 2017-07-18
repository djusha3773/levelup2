package org.levelup;

/**
 * Created by root on 17.07.17.
 */
public class Node<T> {
    private Node next;
    private T t;

    public Node() {
        this.next = null;
    }

    public Node(T t) {
        this(t, null);
    }

    public Node(T t, Node next) {
        this.next = next;
        this.t = t;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next=next;
    }


    public T getT() {
       return t;
    }

    public void setT(T t) {
       this.t=t;
    }

}
