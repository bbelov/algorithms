package com.crackingcodinginterview.strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Check if the string p is permutation of string s.
 */
public class PermutationString {
    public static boolean isPermuation(String s, String p) {
        if (s.length() != p.length()) {
            return false;
        }
        char[] sChars = s.toCharArray();
        char[] pChars = p.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(pChars);
        String newS = new String(sChars), newP = new String(pChars);

        /**

        for (int i = 0; i < sChars.length; i ++) {
            if (sChars[i] != pChars[i]) {
                return false;
            }
        }
         */
        return newS.equals(newP);
    }

    public static boolean isEffecientPermuation(String s, String p) {
        if (s.length() != p.length()) {
            return false;
        }
        int[] chars = new int[128];
        char[] sChars = s.toCharArray();
        char[] pChars = p.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            chars[sChars[i]] ++;
            chars[pChars[i]] --;
        }
        for (int c : chars) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String str = s.next();
            String p = s.next();
            System.out.println(isPermuation(str, p));
            System.out.println(isEffecientPermuation(str, p));
        }
    }
}
