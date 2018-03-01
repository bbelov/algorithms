package com.algorithm.queue;

public class UnorderedPriorityQueue<Key extends Comparable<Key>>{
    private Key[] pq;
    private int capacity;

    public UnorderedPriorityQueue(int n) {
        pq = (Key[])new Comparable[n];
    }

    public boolean isEmpty() {
        return capacity == 0;
    }

    public void Insert(Key x) {
        pq[capacity++] = x;
    }

    public Key delMax() {
        int max = 0;
        for (int i = 1; i < capacity; i++) {
            // if (less(max, i)) max = i;
        }
        // exch(Max, capacity - 1);
        return pq[--capacity];
    }
 }
