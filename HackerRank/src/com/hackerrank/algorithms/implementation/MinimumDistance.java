package com.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinimumDistance {
    static int minimumDistances(int[] a) {
        Set<Integer> indecies = new HashSet<>();
        int min = -1;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (!indecies.contains(j) && a[i] == a[j]) {
                    if (min == -1) {
                        min = Math.abs(i-j);
                    } else {
                        min = Math.min(min, Math.abs(i - j));
                    }
                    indecies.add(j);
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = minimumDistances(a);
        System.out.println(result);
        in.close();
    }
}
