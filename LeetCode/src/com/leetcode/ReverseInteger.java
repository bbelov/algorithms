package com.leetcode;

import java.util.Scanner;

public class ReverseInteger {
    public static int reverse(int x) {
        if (x == 0) {
            return x;
        }
        boolean negative = x < 0;
        if (negative)
        {
            x = -x;
        }
        long reversedNum = 0;
        while (x > 0) {
            reversedNum = reversedNum * 10 + x % 10;
            x = x/10;
        }
        if (negative) {
            reversedNum = -reversedNum;
        }
        if (reversedNum < Integer.MIN_VALUE || reversedNum > Integer.MAX_VALUE ) {
            reversedNum = 0;
        }

        return (int)reversedNum;
    }

    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.println(reverse(s.nextInt()));
    }
}
