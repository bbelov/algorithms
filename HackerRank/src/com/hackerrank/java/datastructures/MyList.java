package com.hackerrank.java.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyList
{
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            int N = in.nextInt(); // list size
            // initalizgin the list
            List<Integer> L = new ArrayList<>(N);
            for (int i = 0; i < N; i++) {
                L.add(Integer.valueOf(in.nextInt()));
            }
            int Q = in.nextInt(); // # of queries
            for (int i =0; i < Q; i++) {
                String query = in.next();
                int x = in.nextInt();
                if (query.equals("Insert")) {
                    // insert x at list L at index y
                    int  y= in.nextInt();
                    L.add(x, y);
                } else if (query.equals("Delete")) {
                    L.remove(x);
                }
            }
            for (Integer i : L) {
                System.out.print(i.intValue() + " ");
            }
        }
    }
}
