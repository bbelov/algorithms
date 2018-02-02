package com.algorithm.sorting.elementary;

public class SelectionSort
{
    /**
     * Find the index of the smallest remaining entry
     * Running time is O(n^2), quadratic.
     *
     * @param a
     */
    public void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i ++) {
            int min = i;
            for (int j = i +1; j < a.length; j ++) {
                if (SortUtils.less(a[j], a[min])) {
                    min = j;
                }
            }
            SortUtils.swap(a, i, min);
        }
    }
}
