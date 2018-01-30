package com.algorithm.stack;

import java.util.Iterator;

/**
 * Stack implementation using linked list and generics.
 * Cannot be implemented as an array, requires casting which is not a best practices.
 *
 */
public class Stack<T> implements Iterable<T>
{
    private Node first = null;
    private Node current = first;

    private class Node {
        T item;
        Node next;
    }

    private class StackIterator implements  Iterator<T>
    {
        @Override
        public boolean hasNext() {
            return first == null;
        }

        @Override
        public T next() {
            T item = null;
            if (hasNext()) {
                item = current.item;
                current = current.next;
            }
            return item;
        }
    }

    public void push(T item) {
        Node tmp = new Node();
        tmp.item = item;
        if (first == null) {
            first = tmp;
        } else {
            tmp.next = first.next;
        }
    }

    public T pop() {
        T item = null;
        if (first != null) {
            item = first.item;
            first = first.next;
        }
        return item;
    }

    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public Iterator<T> iterator() {
        return new StackIterator();
    }
}
