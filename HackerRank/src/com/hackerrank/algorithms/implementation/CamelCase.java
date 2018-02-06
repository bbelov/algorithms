package com.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Given , print the number of words in  on a new line.
 */
public class CamelCase
{
    static int camelcase(String s) {
        int count = 1; // first word is all lowercase, string guranteed to be at least 1 character long
        byte[] chars = s.getBytes();
        for (int i =0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                count++;
            }
        }
        return count;
    }

    static int camelCase(String s) {
        // build delimeter
        StringBuffer sb = new StringBuffer();
        for (int i = 'A'; i <= 'Z'; i++) {
            sb.append((char)i);
        }
        StringTokenizer st = new StringTokenizer(s, sb.toString());
        return st.countTokens();
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String s = in.next();
            if (!(s.length() >= 1 && s.length() <= 100000)) {
                throw new IllegalArgumentException("invalid string");
            }
            int result = camelCase(s);
            System.out.println(result);
        }
    }
}
