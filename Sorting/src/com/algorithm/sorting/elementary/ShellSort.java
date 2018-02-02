package com.algorithm.sorting.elementary;

public class ShellSort
{
    /**
     * Moving entries more than one position at time by h-sorting array. Using insertion sort for h-sorting.
     *
     * @param a
     */
    public void sort(Comparable[] a) {
        int h;
        int size = a.length;
        for (h = 1; h < size/3; h = 3*h + 1) {}

        for (;h >= 1; h = h/3) {
            for (int i = h; i < size; i++) {
                for (int j = i; j >= h && SortUtils.less(a[j], a[j-h]); j-= h) {
                    SortUtils.swap(a, j, j-h);
                }
            }
        }
    }
}
