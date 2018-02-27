package com.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StrongPass {
    static int minimumNumber(int n, String password) {
        int count = 0;
        if (password.matches(".*[a-z].*")) {
            count++;
        }
        if (password.matches(".*[A-Z].*")) {
            count++;
        }
        if (password.matches(".*[0-9].*")) {
            count++;
        }
        if (password.matches(".*[!@#$%^&*()\\-+].*")) {
            count++;
        }
        if (count >= 6) {
            return (4 - count);
        } else {
            return Math.max(4 - count, 6 - n);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }
}
