package com.hackerrank.java.bignumber;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigDecimalSort
{
    public static void main(String []args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        Arrays.sort(s, new Comparator<String>()
            {
                @Override
                public int compare(String o1, String o2) {
                    int rc = 0;
                    if (o1 != null && o2 != null) {
                        BigDecimal o1Bd = new BigDecimal(o1);
                        BigDecimal o2Bd = new BigDecimal(o2);
                        rc = -o1Bd.compareTo(o2Bd);
                    }
                    return rc;
                }
            }
        );
        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
