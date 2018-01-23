package com.hackerrank.java.datastructures;

import java.util.Scanner;

public class Subarray
{
    public static void main(String[] args) {
        // input
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (! (n >= 1 && n <= 100)) {
            throw new IllegalArgumentException("Invalid n");
        }
        int a[] = new int[n];
        for (int i = 0; i < n; ++ i) {
            a[i] = in.nextInt();
        }
        in.close();

        // solution
        int count = 0;
        for (int i = 0; i < n; i++ ) {
            for( int j = i; j < n; j++) {
                int sum = 0;
                for(int k = i; k <= j; k ++) {
                    sum += a[k];
                }
                if (sum < 0) {
                    count ++;
                }
            }
        }
        System.out.println(count);

    }
}
