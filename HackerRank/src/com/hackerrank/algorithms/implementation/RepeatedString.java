package com.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Lilah has a string, , of lowercase English letters that she repeated infinitely many times.
 * Given an integer, , find and print the number of letter a's in the first  letters of Lilah's infinite string.
 */
public class RepeatedString
{
    static long countAs(String s) {
        long count = 0;
        for (char c :s.toCharArray()) {
            if (c == 'a') {
                count ++;
            }
        }
        return count;
    }

    static long repeatedString(String s, long n) {
        long total = countAs(s); // letters 'a' in a single word
        total *= n/s.length();
        long num = n % s.length();
        if (n % s.length() != 0) {
            total += countAs(s.substring(0, (int)(n % s.length())));
        }
        return total;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String s = in.next();
            long n = in.nextLong();
            long result = repeatedString(s, n);
            System.out.println(result);
        }
    }
}
