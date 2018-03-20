package com.crackingcodinginterview.strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Determines if the string has all unique characters.
 * ASsumes string contains ASCII characters only.
 */
public class UniqueString {
    private static int MAX_CHARS = 128; // ASCII chcarter limit, 512 extended one

    /**
     * Validates if the string is unique based on the array
     * @param str
     * @return
     */
    public static boolean isUniqueArrayImpl(String str) {
        if (str.length() > MAX_CHARS) {
            return false;
        }
        boolean[] chars = new boolean[MAX_CHARS];
        boolean rc = true;
        for(char c : str.toCharArray()) {
            if (chars[c]) {
                rc =false;
                break;
            }
            chars[c] = true;
        }
        return rc;
    }

    /**
     * Determines if the string is unique based on the sorting using the string.
     *
     * @return
     */
    public static boolean isUniqueSort(String str) {
        if (str.length() > MAX_CHARS) {
            return false;
        }
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        boolean rc = true;
        for (int i = 1; i < str.length(); i++) {
            if (chars[i-1] == chars[i-1]) {
                rc = false;
                break;
            }
        }
        return rc;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String str = s.next();
            System.out.println(isUniqueArrayImpl(str));
            System.out.println(isUniqueSort(str));
        }
    }
}
