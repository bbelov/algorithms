package com.crackingcodinginterview.stacks;

import java.util.Stack;

public class MyQueue<T>
{
    private Stack<T> newest;
    private Stack<T> oldest;

    public MyQueue() {
        newest = new Stack<>();
        oldest = new Stack<>();
    }

    public void add(T t) {
        newest.push(t);
    }

    public T remove() {
        if (oldest.isEmpty()) {
            moveStack();
        }
        return oldest.pop();
    }

    public T peek() {
        if (oldest.isEmpty()) {
            moveStack();
        }
        return oldest.peek();
    }

    private void moveStack() {
        while (!newest.isEmpty()) {
            oldest.push(newest.pop());
        }
    }
}
