package com.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 */
public class BreakingRecords
{
    static int[] breakingRecords(int[] score) {
        int[] highestLowest = new int[2];
        int max = score[0], min = max;
        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
                highestLowest[0] ++;
            } else if (score[i] < min) {
                min = score[i];
                highestLowest[1] ++;
            }
        }
        return highestLowest;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i = 0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int[] result = breakingRecords(score);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
