package com.hackerrank.daysofcode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BinaryNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String binary = Integer.toBinaryString(n);
        int max = 0, count = 0;
        for (byte b : binary.getBytes()) {
            switch (b) {
                case '1':
                    count++;
                    break;
                case '0':
                    max = Math.max(max, count);
                    count = 0;
                    break;
            }
        }
        max = Math.max(max, count);
        System.out.println(max);
    }
}
