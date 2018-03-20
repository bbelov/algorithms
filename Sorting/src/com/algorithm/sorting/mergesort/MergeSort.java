package com.algorithm.sorting.mergesort;

import com.algorithm.sorting.elementary.SortUtils;

/**
 * Recusrsive implementation of the merge sort.
 */
public class MergeSort
{
    public static void sort(Comparable[] a, Comparable[] aux, int low, int high) {
        if (high <= low) {
            return;
        }
        /**
         * if (high < low + CUTOFF -1) {
         *      InsertionSort.sort(a, low, high);
         * }
         */
        int middle = low + (high - low)/2;
        sort(a, aux, low, middle);
        sort(a, aux, middle+1, high);
        if (!SortUtils.less(a[middle+1], a[middle])) {
            return;
        }
        merge(a, aux, low, middle, high);
    }

    private static void merge(Comparable[] a, Comparable[] aux, int low, int middle, int high) {
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

    private static void merge(Comparable[] a, int low, int middle, int high) {
        Comparable[] lowHalf = new Comparable[middle - low + 1];
        Comparable[] highHalf = new Comparable[high - middle + 1];

        for (int k = low, i = 0; low <= middle; i ++, k++) {
            lowHalf[i] = a[k];
        }
        for (int k = middle + 1, i = 0; k <= high; i ++, k++) {
            lowHalf[i] = a[i];
        }
        int k, i, j;
        for (k = low, i = 0, j = 0; i <= (middle - low - 1) && j <= (high - middle -1); k++) {
            if (lowHalf[i].compareTo(highHalf[i]) < 0) {
                a[k] = lowHalf[i++];
            } else  {
                a[k] = highHalf[j+1];
            }
        }

        while (i < lowHalf.length) {
            a[k++] = lowHalf[i++];
        }
        while (j < highHalf.length) {
            a[k++] = lowHalf[j++];
        }
    }
}
