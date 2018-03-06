package com.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AcmTeam {
    static int[] acmTeam(BitSet[] topic) {
        int[] result = new int[2];
        for (int i = 0; i < topic.length; i ++ ) {
            for (int j = i + 1; j < topic.length; j++) {
                BitSet tmp = new BitSet(5);
                tmp.or(topic[i]);
                tmp.or(topic[j]);
                if (result[0] == tmp.cardinality()) {
                    result[1]++;
                } else if (result[0] < tmp.cardinality()) {
                    result[0] = tmp.cardinality();
                    result[1] = 1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        BitSet[] topic = new BitSet[n];
        for(int topic_i = 0; topic_i < n; topic_i++){
            String str = in.next();
            topic[topic_i] = new BitSet(str.length());
            int count = 0;
            for (char c : str.toCharArray()) {
                if (c == '1' ) {
                    topic[topic_i].set(count);
                }
                count++;
            }

        }
        int[] result = acmTeam(topic);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
