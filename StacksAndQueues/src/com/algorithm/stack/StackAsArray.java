package com.algorithm.stack;

/**
 * Stack implementation using array.
 */
public class StackAsArray
{
    private String[] s;
    private int size = 0;

    public StackAsArray(int n) {
        s = new String[n];
        size = n;
    }

    public void push(String str) {
        if (size == s.length) {
            resize(2 * size);
        }
        s[size++] = str;
    }

    public String pop() {
        String tmp = s[--size];
        s[size] = null;
        if (size > 0 && size == s.length/4) {
            // most effecient way to resize the array - halve the array when array is one-quarter full
            resize(s.length/2);
        }
        return tmp;
    }

    public boolean isEMpty() {
        return size == 0;
    }

    // resizeing array and copying over an old array
    private void resize(int capacity) {
        String[] tmp = new String[capacity];
        for (int i = 0; i < size; i++) {
            tmp[i] = s[i];
        }
        s = tmp;
    }
}
