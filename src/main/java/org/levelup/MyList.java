package org.levelup;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by root on 17.07.17.
 */
public class MyList<E> implements List<E> {

    private Node<E> head;

    private int size = 0;

    public MyList() {
        this.head = new Node<E>();
    }

    //@Override
    public int size() {
        return 0;
    }

    //@Override
    public boolean isEmpty() {
        return false;
    }

    //@Override
    public boolean contains(Object o) {
        return false;
    }

    //@Override
    public Iterator<E> iterator() {
        return null;
    }

    //@Override
    public Object[] toArray() {
        return new Object[0];
    }

    //@Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    // @Override
    public boolean add(E e) {
        Node temp = new Node(e);
        Node curr = head;

        if (head == null) {
            head = temp;
            return false;
        } else {
            while (curr.getNext() != null) {
                if (curr.getT() == e) {
                    return true;
                }
                curr = curr.getNext();
            }

            curr.setNext(temp);
            return false;
        }
    }

    //@Override
    public boolean remove(Object o) {
        Node curr = head;
        Node prev = curr;
        if (head == null) {
            return false;
        }
        if (curr.getT() == (E) o) {
            head = curr.getNext();
            return true;
        }


        prev = curr;
        curr = curr.getNext();
        while (curr.getNext() != null) {

            if (curr.getT() == (E) o) {

                prev.setNext(curr.getNext());
                return true;
            }
            prev = curr;
            curr = curr.getNext();
        }


        return false;
    }

    // @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    //@Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    //@Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    //@Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    //@Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    //@Override
    public void clear() {

    }

    //@Override
    public E get(int index) {
        return null;
    }

    //@Override
    public E set(int index, E element) {
        return null;
    }

    // @Override
    public void add(int index, E element) {

    }

    //@Override
    public E remove(int index) {
        return null;
    }

    //@Override
    public int indexOf(Object o) {
        return 0;
    }

    //@Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    //@Override
    public ListIterator<E> listIterator() {
        return null;
    }

    //@Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    //@Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}