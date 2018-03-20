package com.crackingcodinginterview.strings;

import java.util.Scanner;

/**
 * Replace a whitespace with %20 within a string.
 */
public class URIlify {
    public static String URIlify(String s, int len) {
        char[] chars = s.toCharArray();
        int wsCount = countBlanks(chars, len);
        if (wsCount == 0) {
            return  s;
        }
        int newLen = len + wsCount*2 - 1; // WS already occupies one char, we need 2 more
        for (int i = len -1; i >= 0 & wsCount > 0; i --) {
            if (chars[i] != ' ') {
                chars[newLen--] = chars[i];
            } else {
                chars[newLen - 2] = '%';
                chars[newLen - 1] = '2';
                chars[newLen] = '0';
                newLen -= 3;
            }
        }
        return new String(chars);
    }

    private static int countBlanks(char[] s, int len) {
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (s[i] == ' ') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int len = s.nextInt();
            s.nextLine();
            String str = s.nextLine();
            System.out.println(URIlify(str, len));
        }

    }
}
