package com.algorithm.queue;

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

    public Key deleteMax() {
        Key max = pq[1];
        exch(1, capacity--);
        sink(1);
        pq[capacity+1] = null;
        return max;
    }

    private void swim(int k) {
        while (k > 1 && less(k/2, k)) {
            exch(k, k/2);
            k = k/2;
        }
    }

    private void sink(int k){
        while (2 * k <= capacity) {
            int j = 2*k;
            if (j < capacity && less(j, j+1)) {
                j++;
            }
            if (!less(j, j+1)) {
                break;
            }
            exch(k, j);
            k = j;
        }
    }

    private boolean less( int i, int j) {
        return true;
    }

    private void exch( int i, int j) {

    }
}
