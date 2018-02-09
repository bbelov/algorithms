package com.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DrawingBook
{
    static int solve(int n, int p){
        int count;
        if (p <= n/2) {
            count = p/2;
        } else {
            if (n%2 == 0) {
                count = (n - p + 1)/2;
            } else {
                count = (n - p)/2;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
