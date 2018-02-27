package com.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LibraryFines {
    static int libraryFine(int returnDay, int returnMonth, int returnYear, int dueDay, int dueMonth, int dueYear) {
        if (returnYear > dueYear) {
            return 10000;
        }
        if (returnYear == dueYear && returnMonth > dueMonth) {
            return 500 * (returnMonth-dueMonth);
        }
        if (returnYear == dueYear && returnMonth == dueMonth && returnDay > dueDay) {
            return 15 * (returnDay - dueDay);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
        int result = libraryFine(d1, m1, y1, d2, m2, y2);
        System.out.println(result);
        in.close();
    }
}
