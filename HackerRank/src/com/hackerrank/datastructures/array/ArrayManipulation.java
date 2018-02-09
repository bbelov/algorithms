package com.hackerrank.datastructures.array;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayManipulation
{
    /**
     * 587917 9682497 84538
     *
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int m = in.nextInt();
            long[] array = new long[n];
            long max = 0;
            for (int a0 = 0; a0 < m; a0++) {
                int a = in.nextInt();
                int b = in.nextInt();
                long k = in.nextInt();
                for (int i = (a - 1); i <= (b - 1); i++) {
                    array[i] += k;
                    max = Math.max(max, array[i]);
                }
            }
            System.out.println(max);
        }
    }
}
