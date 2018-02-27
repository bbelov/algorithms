package com.hackerrank.algorithms.strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MakingAnnagrams {
    static int makingAnagrams(String s1, String s2){
        int[] chars = new int['z'-'a' + 1];
        for (char c : s1.toCharArray()) {
            chars[c-'a']++;
        }
        for (char c : s2.toCharArray()) {
            chars[c-'a']--;
        }
        int count = 0;
        for (int c : chars) {
            count += Math.abs(c);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
    }
}
