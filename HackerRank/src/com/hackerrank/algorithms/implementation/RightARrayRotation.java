package com.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * CIrcular right rotation of array.
 *
 */
public class RightARrayRotation {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int k = in.nextInt();
            int q = in.nextInt();
            int[] a = new int[n];
            for (int a_i = 0; a_i < n; a_i++) {
                a[a_i] = in.nextInt();
            }
            int[] m = new int[q];
            for (int m_i = 0; m_i < q; m_i++) {
                m[m_i] = in.nextInt();
                System.out.println(a[(n - k%n + m[m_i]) % n]);
            }
            /*int[] result = circularArrayRotation(a, m);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
            }
            System.out.println(""); */
        }
    }
}
