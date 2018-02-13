package com.hackerrank.algorithms.strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MarsExploration
{
    static int marsExploration(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = 0; i < s.length(); i += 3) {
            if (chars[i] != 'S') {
                count ++;
            }
            if (chars[i+1] != 'O') {
                count ++;
            }
            if (chars[i+2] != 'S') {
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String s = in.next();
            int result = marsExploration(s);
            System.out.println(result);
        }
    }
}
