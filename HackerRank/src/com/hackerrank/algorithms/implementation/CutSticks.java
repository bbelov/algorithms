package com.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CutSticks {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int arr_i = 0; arr_i < n; arr_i++) {
                arr[arr_i] = in.nextInt();
            }

            for (int start = 0, end = n; start < end;) {
                Arrays.sort(arr, start, end);
                System.out.println(end - start);
                int smallest = arr[start];
                for (int i = start; i < end; i ++) {
                    arr[i] -= smallest;
                    if (arr[i] == 0) {
                        start++;
                    }
                }
            }
        }
    }
}
