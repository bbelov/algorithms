package com.leetcode;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        boolean isPalindrome = true;
        for (int i = 0, j = s.length() - 1; i < j;) {
            if (!isAlphanumeric(s.charAt(i))) {
                i++;
                continue;
            }
            if (!isAlphanumeric(s.charAt(j))) {
                j--;
                continue;
            }
            if (Character.toUpperCase(s.charAt(i++)) != Character.toUpperCase(s.charAt(j--))) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    private static boolean isAlphanumeric(char c) {
        return Character.isLetter(c) || Character.isDigit(c);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(isPalindrome(s.nextLine()));
    }
}
