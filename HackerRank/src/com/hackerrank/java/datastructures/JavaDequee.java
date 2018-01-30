package com.hackerrank.java.datastructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class JavaDequee
{
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            Deque deque = new ArrayDeque();
            int n = in.nextInt();
            if (!(n >= 1 && n <= 100000)) {
                throw new IllegalArgumentException("invalid N");
            }
            int m = in.nextInt();
            if (!(m >= 1 && m <= 100000)) {
                throw new IllegalArgumentException("invalid M");
            }
            if (!(m <= n)) {
                throw new IllegalArgumentException("invalud N and/or M");
            }

            for (int i = 0; i < n; i++) {
                int num = in.nextInt();

            }

        }
    }
}
