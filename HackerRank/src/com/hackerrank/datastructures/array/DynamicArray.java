package com.hackerrank.datastructures.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray
{
    public static void main(String[] args) {

        try(Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int q = s.nextInt();
            // initialize sequences
            List<Integer>[] seqList = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                seqList[i] = new ArrayList<>();
            }

            int lastAnswer = 0;
            for (int i = 0; i < q; i ++) {
                int query = s.nextInt();
                int x = s.nextInt();
                int y = s.nextInt();

                switch(query) {
                    case 1:
                        seqList[(x ^ lastAnswer) % n].add(Integer.valueOf(y));
                        break;
                    case 2:
                        List<Integer> seq = seqList[(x ^ lastAnswer) % n];
                        lastAnswer = seq.get(y % seq.size());
                        System.out.println(lastAnswer);
                        break;
                }
            }
        }
    }
}
