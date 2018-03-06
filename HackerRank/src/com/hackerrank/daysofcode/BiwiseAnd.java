package com.hackerrank.daysofcode;

import java.io.*;
import java.util.*;

public class BiwiseAnd {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int testCases = s.nextInt();
            for (int t = 0; t < testCases; t++) {
                int n = s.nextInt();
                int k = s.nextInt();
                int max = 0;
                boolean toBreak = false;
                for (int i = 1; i <= n; i++) {
                    for (int j = i+1; j <= n; j++) {
                        if ((i & j) < k) {
                            max = Math.max(max, i & j);
                        } else {
                            toBreak = true;
                            break;
                        }
                    }
                    if (toBreak) {
                        break;
                    }
                }
                System.out.println(max);
            }
        }
    }
}
