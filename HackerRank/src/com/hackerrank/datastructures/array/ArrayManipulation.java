package com.hackerrank.datastructures.array;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayManipulation
{
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int m = in.nextInt();
            long[] array = new long[n];
            long max = 0;
            for (int a0 = 0; a0 < m; a0++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int k = in.nextInt();
                for (int i = a - 1; i <= (b - 1); i++) {
                    array[i] += k;
                    if (max < array[i]) {
                        max = array[i];
                    }
                }
            }
            System.out.println(max);
        }
    }
}
