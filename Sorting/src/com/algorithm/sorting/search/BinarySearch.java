package com.algorithm.sorting.search;

public class BinarySearch {
    public static boolean search(Comparable[] a, Comparable target) {
        int min = 0, max = a.length - 1, guess;
        boolean rc = false;
        for (;max >= min;) {
            guess = (int)Math.floor((min + max)/2);
            int result = a[guess].compareTo(target);
            if (result == 0) {
                rc = true;
                break;
            } if (result < 0) {
                min = guess + 1;
            } if (result < 0) {
                max = guess - 1;
            }
        }
        return rc;
    }
}
