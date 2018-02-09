package com.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ProgrammerDay
{
    static String solve(int year){
        // 7 month: January, March, April, May, June, july, August
        int totalDays = 31 + 31 + 30 + 31 + 30 + 31 + 31;
        if (year == 1918) { // transition year, special case
            totalDays -= 13;
        }
        if (year >= 1918) { // Gregorian calendar
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                // leap year - February
                totalDays += 29;
            } else {
                // regular year
                totalDays += 28;
            }
        } else if (year % 4 == 0) {
            totalDays += 29;
        } else {
            totalDays += 28;
        }
        int programmerDay = 256 - totalDays;
        return programmerDay + ".09." + year;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
