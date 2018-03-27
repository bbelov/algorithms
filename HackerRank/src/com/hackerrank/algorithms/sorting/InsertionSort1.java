package com.hackerrank.algorithms.sorting;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertionSort1 {
    static void printArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i);
            sb.append(' ');
        }
        System.out.println(sb.toString());
    }

    static void insertionSort1(int n, int[] arr) {
        int e = arr[n-1];
        int i;
        for(i = n-2; i >= 0 && arr[i] > e; i--) {
                arr[i+1] = arr[i];
                printArray(arr);
        }
        arr[i+1] = e;
        printArray(arr);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        insertionSort1(n, arr);
        in.close();
    }
}
