package com.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * John works at a clothing store and he's going through a pile of socks to find the number of matching pairs.
 * More specifically, he has a pile of  loose socks where each sock  is labeled with an integer, , denoting its color.
 * He wants to sell as many socks as possible, but his customers will only buy them in matching pairs.
 * Two socks,  and , are a single matching pair if they have the same color ().
 *
 * Given  and the color of each sock, how many pairs of socks can John sell?
 */
public class SockMerchant
{
    static int sockMerchant(int n, int[] ar) {
        Hashtable<Integer, Integer> sockColors = new Hashtable<>();
        // claculate how many socks of each color there are
        for (int i = 0; i < n; i++) {
            Integer key = Integer.valueOf(ar[i]);
            Integer c = sockColors.get(key);
            if (c == null) {
                sockColors.put(key, Integer.valueOf(1));
            } else {
                sockColors.put(key, ++c);
            }
        }
        // find out number of pairs
        int pairs = 0;
        for (Integer c : sockColors.keySet()) {
            pairs += sockColors.get(c)/2;
        }
        return pairs;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int[] ar = new int[n];
            for (int ar_i = 0; ar_i < n; ar_i++) {
                ar[ar_i] = in.nextInt();
            }
            int result = sockMerchant(n, ar);
            System.out.println(result);
        }
    }
}
