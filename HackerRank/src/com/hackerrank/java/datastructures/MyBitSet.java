package com.hackerrank.java.datastructures;

import java.util.BitSet;
import java.util.Scanner;

public class MyBitSet
{
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            int N = in.nextInt(); // size of bit set
            if (!(N >= 1 && N <= 1000)) {
                throw new IllegalArgumentException("invalid N");
            }
            int M = in.nextInt(); // # of operations
            if (!(M >= 1 && M <= 10000)) {
                throw new IllegalArgumentException("invalid M");
            }
            BitSet[] set = {new BitSet(N), new BitSet(N)};
            for (int i = 0; i < M; i++) {
                String cmd = in.next(); // command: AND, OR, XOR, FLIP, SET
                int id1 = in.nextInt();
                int id2 = in.nextInt();
                switch (cmd) {
                    case "AND":
                        set[id1-1].and(set[id2-1]);
                        break;
                    case "OR":
                        set[id1-1].or(set[id2-1]);
                        break;
                    case "XOR":
                        set[id1-1].xor(set[id2-1]);
                        break;
                    case "FLIP": // flip bit id2 in set id1
                        set[id1-1].flip(id2);
                        break;
                    case "SET": // set bit id2 in set id1
                        set[id1-1].set(id2);
                        break;
                }
                System.out.println(set[0].cardinality() + " " + set[1].cardinality());
            }
        }
    }
}
