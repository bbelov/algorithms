package com.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CountingValleys
{
    static int countingValleys(int n, String s) {
        int valleys = 0, steps = 0;
        for (byte c : s.getBytes()) {
            switch(c) {
                case 'D':
                    steps--;
                    break;
                case 'U':
                    if ((steps + 1) == 0) {
                        valleys ++;
                    }
                    steps++;
            }
        }
        return valleys;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            String s = in.next();
            int result = countingValleys(n, s);
            System.out.println(result);
        }
    }
}
