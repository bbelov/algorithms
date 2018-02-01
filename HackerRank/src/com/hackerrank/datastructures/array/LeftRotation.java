package com.hackerrank.datastructures.array;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LeftRotation
{
    static int[] leftRotation(int[] a, int d) {
        if (d == a.length) {
            return a;
        }
        int n = a.length;
        /// inefficient solution - O(n^2) runetime, O(n) memory
        /*for (int shift = 0; shift < d; shift++) {
            for (int i = 0; i < (n-1); i++) {
                int tmp = a[i];
                a[i] = a[i+1];
                a[i+1] = tmp;
            }
        }*/
        // O(n) runtime, O(2n) memory
        int[] tmp = new int[a.length];
        for (int i = 0; i < n; i++) {
            tmp[(i+n-d)%n] = a[i ];
        }
        return tmp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
