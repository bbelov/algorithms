package com.algorithm.sorting.elementary;

import java.util.Comparator;

public final class SortUtils
{
    /**
     *
     * @param item1
     * @param item2
     * @return
     */
    public static boolean less(Comparable item1, Comparable item2) {
        return item1.compareTo(item2) < 0;
    }

    /**
     * Implementation using Comparator rather than Comparable.
     *
     * @param c
     * @param o1
     * @param o2
     * @return
     */
    public static boolean less(Comparator c, Object o1, Object o2) {
        return c.compare(o1, o2) < 0;
    }

    /**
     * Exchanges two items in the array.
     *
     * @param a
     * @param i
     * @param j
     */
    public static void swap(Comparable[] a, int i, int j) {
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void swap(Object[] a, int i, int j) {
        Object tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    /**
     * Validates if the array is sorted.
     *
     * @param a
     * @return
     */
    public static boolean isSorted(Comparable[] a, int low, int high) {
        for (int i = low; i <= high; i++) {
            if (less(a[i], a[i-1])) {
                return false;
            }
        }
        return true;
    }


}
