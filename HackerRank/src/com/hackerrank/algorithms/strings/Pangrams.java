package com.hackerrank.algorithms.strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangrams
{
    public static void main(String args[] ) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            String s = scanner.nextLine();
            // initialize the map
            Map<Character, Integer> map = new HashMap<>();
            for (char c = 'a'; c <= 'z'; c++) {
                map.put(c, 0);
            }
            String str = s.toLowerCase();
            char[] chars = str.toCharArray();
            for (int i =0;i < chars.length; i++) {
                if (chars[i] == ' ') {
                    continue;
                }
                map.put(chars[i], new Integer(map.get(chars[i]) + 1));
            }
            String result = "pangram";
            for (Integer i : map.values()) {
                if (i.intValue() == 0) {
                    result = "not pangram";
                    break;
                }
            }
            System.out.println(result);
        }
    }
}
