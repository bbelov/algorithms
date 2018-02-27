package com.hackerrank.algorithms.strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HrString {
    static String hackerrankInString(String s) {
        String hr = "hackerrank";
        int hrIdx = 0;
        for (int sIdx = 0; sIdx < s.length(); sIdx ++) {
            if (hrIdx < hr.length() && s.charAt(sIdx) == hr.charAt(hrIdx)) {
                hrIdx++;
            }
        }
        return (hrIdx == hr.length()) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = hackerrankInString(s);
            System.out.println(result);
        }
        in.close();
    }
}
