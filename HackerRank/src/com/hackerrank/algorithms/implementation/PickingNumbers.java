package com.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Given an array of integers, find and print the maximum number of integers you can select from the array
 * such that the absolute difference between any two of the chosen integers is <= 1.
 */
public class PickingNumbers {
    static int pickingNumbers(int[] a) {
        Arrays.sort(a);
        int n = a.length, max = 0, count;
        for (int i = 0; i < n; i ++) {
            count = 0;
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(a[i] - a[j]) <= 1) {
                    count ++;
                } else {
                    if (count != 0) {
                        max = Math.max(max, count + 1);
                    }
                    i = j -1;
                    break;
                }
            }
            if (count != 0) {
                max = Math.max(max, count + 1);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int a_i = 0; a_i < n; a_i++) {
                a[a_i] = in.nextInt();
            }
            int result = pickingNumbers(a);
            System.out.println(result);
        }
    }
}
