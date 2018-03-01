package com.algorithm.sorting.elementary;

public class BinaryHeap<Key extends Comparable<Key>> {
    private Key[] pq;
    private int capacity;


    BinaryHeap(int n) {
        pq = (Key[])new Comparable[n];
    }

    public boolean isEmpty() {
        return capacity == 0;
    }

    public void insert(Key x) {
        pq[++capacity] = x;
        swim(capacity);
    }

    private void swim(int k) {
        while (k > 1 && less(k/2, k)) {
            exch(k, k/2);
            k = k/2;
        }
    }

    private boolean less( int i, int j) {
        return true;
    }

    private void exch( int i, int j) {

    }
}
