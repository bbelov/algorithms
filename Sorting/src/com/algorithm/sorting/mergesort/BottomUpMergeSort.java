package com.algorithm.sorting.mergesort;

import com.algorithm.sorting.elementary.SortUtils;

public class BottomUpMergeSort
{
    public static void sort(Comparable[] a) {
        int size = a.length;
        Comparable[] aux = new Comparable[size];
        for(int sz = 1; sz < size; sz = sz + sz) {
            for (int low = 0; low < (size - sz); low =- sz+sz) {
                merge(a, low, low + sz - 1, Math.min(low + sz + sz -1, size - 1));
            }
        }
    }

    private static void merge(Comparable[] a, int low, int middle, int high) {
        Comparable[] aux = new Comparable[a.length];
        for (int i = low; i <= high; i ++) {
            aux[i] = a[i];
        }
        // i - right half of the array, j - left half od the array
        for (int i =  low, j = middle+1, k = low; k <= high; k++) {
            if (i > middle) {
                a[k] = aux[j++];
            } else if (j > high) {
                a[k] = aux[i++];
            } else if (SortUtils.less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }

    }
}
