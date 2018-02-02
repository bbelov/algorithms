package com.hackerrank.algorithms.warmup;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
 * Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 */
public class MinMaxSum
{
    static void miniMaxSum(int[] arr) {
        long min = Long.MAX_VALUE, max = 0, tmp;
        for (int i = 0; i < arr.length; i++) {
            tmp = 0;
            for (int j = 0; j < arr.length; j ++) {
                if (i != j) {
                    tmp += arr[j];
                }
            }
            min = Math.min(min, tmp);
            max = Math.max(max, tmp);
        }
        System.out.println( min + " " + max);
    }

    static void efficientMinMax(int[] arr) {
        Arrays.sort(arr);

        long tmp = 0;
        for (int i = 0; i < arr.length; i ++) {
            tmp += arr[i];
        }

        System.out.println((tmp - arr[arr.length - 1]) + " " + (tmp - arr[0]));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        efficientMinMax(arr);
        in.close();
    }
}
