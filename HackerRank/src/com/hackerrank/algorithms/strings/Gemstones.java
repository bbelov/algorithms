package com.hackerrank.algorithms.strings;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Gemstones {
    static int gemstones(String[] arr){
        char[] chars = arr[0].toCharArray();
        Map<Character, Integer> counters = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (counters.get(chars[i]) == null) {
                counters.put(chars[i], 1);
            }
        }
        for (int i = 1; i < arr.length; i ++) {
            for (Character k : counters.keySet()) {
                if (arr[i].contains(k.toString())) {
                    counters.put(k, counters.get(k).intValue() + 1);
                }
            }
        }
        int gems = 0;
        for (Integer i : counters.values()) {
            if (i.intValue() == arr.length) {
                gems++;
            }
        }
        return gems;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        int result = gemstones(arr);
        System.out.println(result);
    }
}
