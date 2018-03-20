package com.crackingcodinginterview.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Given NxM matrix write an algorithm such that if element is 0 then row and column should be zeroed.
 *
 */
public class ZeroMatrix {

    public static void solution(int[][] m) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> columns = new HashSet<>();
        getPositions(m, rows, columns);
        zeroMatrix(m, rows, columns);
    }

    public static void main(String[] args0) {

    }

    private static void getPositions(int[][] m, Set<Integer> rows, Set<Integer> columns) {
        for (int i = 0; i < m.length; i ++) {
            for (int j = 0;j < m[i].length; j++) {
                if (m[i][j] == 0) {
                    rows.add(i);
                    columns.add(j);
                }
            }
        }
    }

    private static void zeroMatrix(int[][] m, Set<Integer> rows, Set<Integer> columns) {
        for (int r : rows) {
            for (int i = 0; i < m[i].length; i++) {
                m[r][i] = 0;
            }
        }
        for (int c : columns) {
            for (int i = 0; i < m.length; i++) {
                m[i][c] = 0;
            }
        }
    }
}
