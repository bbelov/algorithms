package com.hackerrank.algorithms.sorting;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertionSort2 {
    static void printArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i);
            sb.append(' ');
        }
        System.out.println(sb.toString());
    }

    static void insertionSort2(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int j, tmp = arr[i];
            for(j = i-1; j >= 0 && arr[j] > tmp; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = tmp;
            printArray(arr);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        insertionSort2(n, arr);
        in.close();
    }
}
