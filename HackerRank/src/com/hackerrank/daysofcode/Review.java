package com.hackerrank.daysofcode;

import java.io.*;
import java.util.*;

public class Review
{
    private static void printCharacters(int start, int step, String s) {
        byte[] chars = s.getBytes();
        for (int i = start; i < chars.length; i += step) {
            System.out.print((char)chars[i]);
        }
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int t = scan.nextInt();
            if (!(t <= 10)) {
                throw new IllegalArgumentException("invalid t");
            }
            for (int i = 0; i < t; i++) {
                String s = scan.next();
                if (!(s.length() >= 2 && s.length() <= 10000)) {
                    throw new IllegalArgumentException("Invalid s");
                }
                printCharacters(0, 2, s);
                System.out.print(" ");
                printCharacters(1, 2, s);
                System.out.println();
            }
        }
    }
}
