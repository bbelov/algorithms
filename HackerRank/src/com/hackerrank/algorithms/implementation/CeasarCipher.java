package com.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Julius Caesar protected his confidential information by encrypting it in a cipher.
 * Caesar's cipher rotated every letter in a string by a fixed number, , making it unreadable by his enemies.
 * Given a string, , and a number, , encrypt  and print the resulting string.
 * Note: The cipher only encrypts letters; symbols, such as -, remain unencrypted.
 */
public class CeasarCipher
{
    static String caesarCipher(String s, int k) {
        int range =(int)('z' - 'a') + 1;
        byte[] chars = s.getBytes();
        for (int i = 0;i < chars.length; i ++) {
            if ((chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'Z')) {
                byte start = 0;
                if (chars[i] >= 'a' && chars[i] <= 'z') {
                    start = 'a';
                } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                    start = 'A';
                }
                chars[i] = (byte) (start + (chars[i] - start + k) % range);
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            if (!(n >= 1 && n <= 100)) {
                throw new IllegalArgumentException("Invalid n");
            }
            String s = in.next();
            if (!(s.length() >= 1 && s.length() <= n)) {
                throw new IllegalArgumentException("Invalid s");
            }
            int k = in.nextInt();
            if (!(k >= 0 && k <= 100)) {
                throw new IllegalArgumentException("Invalid k");
            }
            String result = caesarCipher(s, k);
            System.out.println(result);
        }
    }
}
