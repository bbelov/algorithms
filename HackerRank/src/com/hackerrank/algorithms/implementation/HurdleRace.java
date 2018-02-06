package com.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Dan is playing a video game in which his character competes in a hurdle race by jumping over  hurdles with heights .
 * He can initially jump a maximum height of  units, but he has an unlimited supply of magic beverages that help him jump higher!
 * Dan can drink any number magic beverages and the maximum height he can jump during the entire race increases by the number of magic beverages he drink.
 * Given , , and the heights of all the hurdles, find and print the minimum number of magic beverages Dan must drink to complete the race.
 */

public class HurdleRace
{
    static int hurdleRace(int k, int[] height) {
        int max = 1;
        for (int i =0; i < height.length; i ++) {
            max = Math.max(max, height[i]);
        }
        return ((max - k) < 0) ?  0 : max - k;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] height = new int[n];
            for (int height_i = 0; height_i < n; height_i++) {
                height[height_i] = in.nextInt();
            }
            int result = hurdleRace(k, height);
            System.out.println(result);
        }
    }
}
