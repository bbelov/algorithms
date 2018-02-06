package com.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Anna and Brian order  items at a restaurant, but Anna declines to eat any of the  item (where ) due to an allergy.
 * When the check comes, they decide to split the cost of all the items they shared;
 * however, Brian may have forgotten that they didn't split the  item and accidentally charged Anna for it.
 * You are given n, k, the cost of each of the  items, and the total amount of money
 * that Brian charged Anna for her portion of the bill. If the bill is fairly split, print Bon Appetit;
 * otherwise, print the amount of money that Brian must refund to Anna. It is guaranteed that the amount will always be an integer.
 */
public class BonApetit
{
    static void bonAppetit(int n, int k, int b, int[] charges) {
        int actualCharge = 0;
        for (int i = 0; i < charges.length; i++) {
            actualCharge += charges[i];
        }
        actualCharge -= charges[k];
        int difference = b - actualCharge/2;
        if (difference == 0) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(difference);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        bonAppetit(n, k, b, ar);
    }
}
