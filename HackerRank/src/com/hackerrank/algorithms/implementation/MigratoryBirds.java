package com.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * A flock of  birds is flying across the continent.
 * Each bird has a type, and the different types are designated by the ID numbers , , , , and .
 * Given an array of  integers where each integer describes the type of a bird in the flock, find and print the type number of the most common bird.
 * If two or more types of birds are equally common, choose the type with the smallest ID number.
 */
public class MigratoryBirds
{
    static int migratoryBirds(int n, int[] ar) {
        Arrays.sort(ar);
        HashMap<Integer, Integer> birds = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Integer key = Integer.valueOf(ar[i]);
            Integer bird = birds.get(key);
            if (bird == null) {
                birds.put(key, Integer.valueOf(1));
            } else {
                birds.put(key, ++bird);
            }
        }
        int maxBirds = 0, birdType = 0;
        for (Integer type : birds.keySet()) {
            Integer birdCount = birds.get(type);
            if (maxBirds < birdCount) {
                birdType = type;
                maxBirds = birdCount;
            } else if (maxBirds == birdCount) {
                birdType = Math.min(birdType, type);
            }
        }
        return birdType;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
