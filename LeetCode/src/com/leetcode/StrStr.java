package com.leetcode;

import java.util.Scanner;

public class StrStr {
    public static int strStr(String haystack, String needle) {
        int index = -1;
        if (needle == null || needle.isEmpty()) {
            return 0;
        }
        if (haystack == null || haystack.isEmpty() || haystack.length() < needle.length()) {
            return index;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int j = 0;
                for (; j < needle.length() && (j+i) < haystack.length(); j++) {
                    if (haystack.charAt(i+j) != needle.charAt(j)) {
                        break;
                    }
                }
                if (j == needle.length()){
                    index = i;
                    break;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String haystack = s.next();
        String needle = s.next();
        System.out.println(strStr(haystack, needle));
    }
}
