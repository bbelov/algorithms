package com.hackerrank.algorithms.strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FunnyString {
    static String funnyString(String s){
        String result = "Funny";
        char[] chars = s.toCharArray();
        for (int i = 1, j = s.length() -2; i <= s.length()/2; i ++, j-- ) {
            if (Math.abs(chars[i] - chars[i-1]) != Math.abs(chars[j] - chars[j+1])) {
                result = "Not Funny";
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }
}
