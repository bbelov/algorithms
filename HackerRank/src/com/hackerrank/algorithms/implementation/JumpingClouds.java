package com.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Emma is  playing a new mobile game involving N clouds numbered from 0  to N-1.
 * A player initially starts out on cloud 0, and they must jump to cloud N-1 .
 * In each step, she can jump from any cloud I to cloud I+1 or cloud I+2.
 * There are two types of clouds, ordinary clouds and thunderclouds.
 * The game ends if Emma jumps onto a thundercloud, but if she reaches the last cloud (i.e., ), she wins the game!
 */
public class JumpingClouds {
    static int jumpingOnClouds(int[] c) {
        int steps = 0;
        for (int i = 0; i < c.length - 1;) {
            if ((i+2) < c.length && c[i+2] == 0) {
                steps ++;
                i += 2;
            } else if ( (i+1) < c.length){
                steps ++;
                i++;
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int[] c = new int[n];
            for (int c_i = 0; c_i < n; c_i++) {
                c[c_i] = in.nextInt();
            }
            int result = jumpingOnClouds(c);
            System.out.println(result);
        }
    }
}
