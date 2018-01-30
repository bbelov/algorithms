package com.algorithm.queue;

/**
 * Simple queue implementation using generics
 *
 * @param <T>
 */
public class Queue<T>
{
    private Node tail = null;
    private Node head = null;

    private class Node {
        T item;
        Node next;
    }

    public void enqueue(T item) {
        Node tmp = new Node();
        tmp.item = item;
        tmp.next = null;
        if (isEmpty()) {
            head = tmp;
            tail = head;
        } else {
            tail.next = tmp;
            tail = tmp;
        }
    }

    public T dequeue() {
        T item = null;
        if (!isEmpty()) {
            item = tail.item;
            head = head.next;
        } else {
            tail = null;
        }
        return item;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
