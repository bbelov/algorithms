package com.hackerrank.java.datastructures;

import java.io.*;
import java.util.*;

public class MyArraylist
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<List> total = new ArrayList<>(n);
        for(int i = 0; i < n; i++) {
            int d = in.nextInt();
            List a = new ArrayList(d);
            if (d > 0) {
                for (int j = 0; j < d; j++) {
                    a.add(in.nextInt());
                }
            }
            total.add(a);
        }
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            try {
                int x = in.nextInt();
                List<List> tmp = total.get(x-1);
                int y = in.nextInt();
                System.out.println(tmp.get(y-1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }

        }
        in.close();
    }
}
