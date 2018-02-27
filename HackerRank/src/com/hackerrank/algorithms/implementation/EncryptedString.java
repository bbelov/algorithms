package com.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EncryptedString {
    static String encryption(String s) {
        String s1 = s.replaceAll("\\s", "");
        int rows = (int)Math.floor(Math.sqrt(s1.length()));
        int columns = (int)Math.ceil(Math.sqrt(s1.length()));
        if (rows * columns < s1.length()) {
            rows = columns;
        }
        char[][] encryptedString = new char[rows][columns];
        char[] chars = s1.toCharArray();
        int idx = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (idx < s1.length()) {
                    encryptedString[i][j] = chars[idx++];
                } else {
                    break;
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                if (encryptedString[j][i] == '\0') {
                    break;
                }
                sb.append(encryptedString[j][i]);
            }
            sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String result = encryption(s);
        System.out.println(result);
        in.close();
    }
}
