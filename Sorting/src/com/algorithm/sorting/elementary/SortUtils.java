package com.algorithm.sorting.elementary;

public final class SortUtils
{
    public static boolean less(Comparable item1, Comparable item2) {
        return item1.compareTo(item2) < 0;
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

    /**
     * Validates if the array is sorted.
     *
     * @param a
     * @return
     */
    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i-1])) {
                return false;
            }
        }
        return true;
    }
}
