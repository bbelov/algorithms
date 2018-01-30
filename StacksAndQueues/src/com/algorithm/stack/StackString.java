package com.algorithm.stack;

/**
 * Simple stakc implementation with String items using linked list
 *
 */
public class StackString
{

    private class Node {
        String item;
        Node next;
    }

    private Node first;

    public StackString() {
    }

    public void push(String s) {
        Node tmp = new Node();
        tmp.item = s;
        tmp.next = first;
        first = tmp;
    }

    public String pop() {
        String tmp = null;
        if (first != null) {
            tmp = first.item;
            first = first.next;
        }
        return tmp;
    }

    public boolean isEmpty() {
        return first == null;
    }
}
