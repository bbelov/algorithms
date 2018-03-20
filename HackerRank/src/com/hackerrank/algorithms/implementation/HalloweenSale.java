package com.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HalloweenSale {
    static int howManyGames(int p, int d, int m, int s) {
        int count = 0;
        if (s >= p) {
            s -= p;
            for (; s > 0; s -= p) {
                count++;
                if ((p-d) > m) {
                    p -= d;
                } else {
                    p = m;
                }
                if (p == s) {
                    count++;
                }
            }

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int d = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();
        int answer = howManyGames(p, d, m, s);
        System.out.println(answer);
        in.close();
    }
}
