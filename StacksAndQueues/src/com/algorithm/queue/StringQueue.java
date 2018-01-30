package com.algorithm.queue;

/**
 * String implementation of
 */
public class StringQueue
{
    private Node first;
    private Node last;

    private class Node {
        String item;
        Node next;
    }

    public void enqueue(String s) {
        Node tmp = new Node();
        tmp.item = s;
        tmp.next = null;
        if (isEmpty()) {
            first = tmp;
            last = tmp;
        } else {
            last.next = tmp;
            last = tmp;
        }
    }

    public String dequeue() {
        String tmp = first.item;
        first = first.next;

        if (isEmpty()) {
            last = null;
        }
        return tmp;
    }

    public boolean isEmpty() {
        return first == null;
    }
}
