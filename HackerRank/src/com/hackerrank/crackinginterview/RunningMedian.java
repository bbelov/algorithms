package com.hackerrank.crackinginterview;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RunningMedian {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int a_i = 0; a_i < n; a_i++) {
                a[a_i] = in.nextInt();
                Arrays.sort(a, 0, a_i + 1);
                if ((a_i + 1) % 2 != 0) {
                    System.out.println((double)a[a_i/2]);
                } else {
                    System.out.println(((double)(a[a_i/2] + a[a_i/2 + 1]))/2);
                }

            }
        }
    }
}
