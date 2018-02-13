package com.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BeatuifulDays {
    static int reverseNumber(int num) {
        int reversed = 0, tmp = num;
        while (tmp != 0) {
            reversed = reversed * 10 + tmp % 10;
            tmp /= 10;
        }
        return reversed;
    }

    static int beautifulDays(int i, int j, int k) {
        int count = 0;
        for (int num = i; num <= j; num++) {
            //System.out.println(num  + " " + reverseNumber(num) + " " + (Math.abs(num - reverseNumber(num)) % k));
            if ((Math.abs(num - reverseNumber(num)) % k) == 0) {
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(2 %8);
        try (Scanner in = new Scanner(System.in)) {
            int i = in.nextInt();
            int j = in.nextInt();
            int k = in.nextInt();
            int result = beautifulDays(i, j, k);
            System.out.println(result);
        }
    }
}
