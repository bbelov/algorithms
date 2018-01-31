package com.hackerrank.datastructures.array;

import java.util.Scanner;

public class SparseArray
{
    public static void main(String[] args) {

        try(Scanner s = new Scanner(System.in))
        {
            int n = s.nextInt();
            String[] strings = new String[n];
            for (int i = 0; i < n; i++) {
                strings[i] = s.next();
            }
            int query = s.nextInt();
            for (int i = 0; i < query; i ++) {
                String subStr = s.next();
                int total = 0;
                for (String str : strings) {
                    if (str.equals(subStr)) {
                        total++;
                    }
                }
                System.out.println(total);
            }
        }
    }
}
