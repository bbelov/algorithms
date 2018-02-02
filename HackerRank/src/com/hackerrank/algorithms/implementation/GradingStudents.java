package com.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/**
 * At HackerLand University, a passing grade is any grade 40 points or higher on a 100 point scale.
 * Sam is a professor at the university and likes to round each student’s grade according to the following rules:
 *  - If the difference between the grade and the next higher multiple of 5 is less than 3, round to the next higher multiple of 5
 * - If the grade is less than 38, don’t bother as it’s still a failing grade
 *Automate the rounding process then round a list of grades and print the results.
 */
public class GradingStudents
{
    static int[] solve(int[] grades){
        for (int i = 0; i < grades.length; i ++) {
            if (grades[i] >= 38) {
                int higherMultiplier = (grades[i] + 5) - (grades[i] + 5) % 5;
                if ((higherMultiplier - grades[i]) < 3) {
                    grades[i] = higherMultiplier;
                }
            }
        }
        return grades;
    }

    public static void main(String[] args) {
        int[] grades;
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            if (! (n >= 1 && n <= 60)) {
                throw new IllegalArgumentException("invalid N");
            }
            grades = new int[n];
            for (int grades_i = 0; grades_i < n; grades_i++) {
                grades[grades_i] = in.nextInt();
                if (! (grades[grades_i] >= 0 && grades[grades_i] <= 100)) {
                    throw new IllegalArgumentException("Invalid grade");
                }
            }
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


    }
}
