package com.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Karl has an array of  integers defined as . In one operation, he can delete any element from the array.
 * Karl wants all the elements of the array to be equal to one another.
 * To do this, he must delete zero or more elements from the array.
 * Find and print the minimum number of deletion operations Karl must perform so that all the array's elements are equal.
 */
public class ArrayEqualizer
{
    static int equalizeArray(int[] arr) {
        Arrays.sort(arr);
        int max = 1, count = 1, num = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (num != arr[i]) {
                max = Math.max(max, count);
                count = 1;
                num = arr[i];
            } else {
                count ++;
            }
        }
        max = Math.max(max, count);
        return arr.length - max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = equalizeArray(arr);
        System.out.println(result);
        in.close();
    }
}
