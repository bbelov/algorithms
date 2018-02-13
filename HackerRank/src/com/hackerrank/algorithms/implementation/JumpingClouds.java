package com.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JumpingClouds {
    static int jumpingOnClouds(int[] clouds, int k) {
        int energy = 100;
        for (int i = k % clouds.length;;i = (i + k) % clouds.length) {
            energy--;
            if (clouds[i] == 1) {
                energy -= 2;
            }
            if (i == 0) {
                break;
            }
        }
        return energy;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for(int c_i = 0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int result = jumpingOnClouds(c, k);
        System.out.println(result);
        in.close();
    }
}
