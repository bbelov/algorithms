package com.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * In this type of PDF viewer, the width of the rectangular selection area is equal to the number of letters in the word times the width of a letter,
 * and the height is the maximum height of any letter in the word.
 * Consider a word consisting of lowercase English alphabetic letters, where each letter is 1 mm  wide.
 * Given the height of each letter in millimeters, find the total area that will be highlighted by blue rectangle in mm^2 when the given word is selected in our new PDF viewer
 */
public class PdfViewer {
    static int designerPdfViewer(int[] h, String word) {
        int max = 0;
        for (byte c : word.getBytes()) {
            max = Math.max(max, h[c - 'a']);
        }
        return word.length() * max;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int[] h = new int[26];
            for (int h_i = 0; h_i < 26; h_i++) {
                h[h_i] = in.nextInt();
            }
            String word = in.next();
            int result = designerPdfViewer(h, word);
            System.out.println(result);
        }
    }
}
