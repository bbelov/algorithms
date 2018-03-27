package com.hackerrank.algorithms.strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * ou are given a string containing characters A  and  B only. Your task is to change it into a string such that every two consecutive characters are different. To do this, you are allowed to delete one or more characters in the string.

 Your task is to find the minimum number of required deletions.
 */
public class AlternatingCharacters {
    static int alternatingCharacters(String s){
        int minimumDeletions = 0, count = 0;
        char prev = s.charAt(0);
        for (char c : s.toCharArray()) {
            if (c == prev) {
                count++;
            } else {
                minimumDeletions += (count - 1);
                count = 1;
            }
            prev = c;
        }
        minimumDeletions += (count - 1);
        return minimumDeletions;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
    }
}
