package com.hiredintech;

import java.util.Scanner;

public class NumericPalindrome {
    public static boolean is_numeric_palindrome(long number) {
        // find the number of digits
        int length = 0;
        long tmp = number;
        while (tmp > 0) {
            tmp /= 10;
            length++;
        }
        tmp = (long)Math.pow(10, length -1);
        while(number > 0) {
            if (!(number / tmp == number % 10)) {
                return false;
            }
            number = (number % 10) / 10;
            tmp /= 100;
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            long n = s.nextLong();
            System.out.println(is_numeric_palindrome(n));
        }
    }
}
