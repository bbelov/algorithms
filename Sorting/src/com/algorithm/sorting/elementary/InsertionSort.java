package com.algorithm.sorting.elementary;

import java.util.Comparator;

public class InsertionSort
{
    /**
     * Swaps element with the largest element to the right.
     * Worst case running time is quadratic, best case and partially sorted array - linear.
     *
     * @param a
     */
    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (SortUtils.less(a[j], a[j-1])) {
                    SortUtils.swap(a, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    /**
     * Insertion sort using Comparator.
     *
     * @param a
     * @param comparator
     */
    public static void sort(Comparable[] a, Comparator comparator) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (SortUtils.less(comparator, a[j], a[j-1])) {
                    SortUtils.swap(a, j, j-1);
                } else {
                    break;
                }
            }
        }
    }
}
