package com.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CatsAndMouse
{
    static String catAndMouse(int x, int y, int z) {
        int catA = Math.abs(z - x); // difference betwen cat A and the mouse
        int catB = Math.abs(z - y); // different between cat B and the mouse
        String answer;
        if (catA < catB) {
            answer = "Cat A";
        } else if (catB < catA) {
            answer = "Cat B";
        } else {
            answer = "Mouse C";
        }
        return answer;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int q = in.nextInt();
            for (int a0 = 0; a0 < q; a0++) {
                int x = in.nextInt();
                int y = in.nextInt();
                int z = in.nextInt();
                System.out.println(catAndMouse(x, y, z));
            }
        }
    }
}
