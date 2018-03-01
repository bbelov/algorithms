package com.hiredintech;

import java.util.Scanner;

public class SumOfDigits {
    public static int digit_sum(long number) {
        int sum = 0;
        if (number < 0) {
            number *= -1;
        }
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println(digit_sum(s.nextLong()));
        }
    }
}
