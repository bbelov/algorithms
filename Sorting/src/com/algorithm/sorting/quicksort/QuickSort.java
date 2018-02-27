package com.algorithm.sorting.quicksort;

import com.algorithm.sorting.elementary.SortUtils;

import java.awt.event.ComponentAdapter;

public class QuickSort {

    private static int partiion(Comparable[] a, int low, int high) {
        int i = low, j = high + 1;
        while(true) {
            while(SortUtils.less(a[++i], a[low])) {
                if (i == high) {
                    break;
                }
            }
            while (SortUtils.less(a[low], a[--j])) {
                if (j == low) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            SortUtils.swap(a, i, j);
        }
        SortUtils.swap(a, low, j);
        return j;
    }

    private static void threWaySort(Comparable[] a, int low, int high) {
        if (high <= low) {
            return;
        }
        int lt = low, gt = high;
        Comparable v = a[low];
        for (int i = low; i <= gt; ) {
            int cmp = a[i].compareTo(v);
            if (cmp < 0 ) {
                SortUtils.swap(a, lt++, i++);
            } else if (cmp > 0) {
                SortUtils.swap(a, i, gt--);
            } else {
                i++;
            }
        }
        sort(a, low, lt -1 );
        sort(a, gt + 1, high);
    }

    public static void sort(Comparable[] a, int low, int high) {
        if (high <= low) {
            return;
        }
        int j = partiion(a, low, high);
        sort(a, low, j - 1);
        sort(a, j + 1, high);
    }

    public static void sort(Comparable[] a) {
        // shuffle elemnts
        sort(a, 0, a.length - 1);
    }

}
