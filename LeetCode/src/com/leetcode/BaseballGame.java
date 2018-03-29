package com.leetcode;

import java.util.Scanner;
import java.util.Stack;

public class BaseballGame {
    public static int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < ops.length; i++) {
            switch(ops[i]) {
                case "D":
                    int points = 2 *stack.peek();
                    sum += points;
                    stack.push(points);
                    break;
                case "C":
                    sum -= stack.pop();
                    break;
                case "+":
                    int a = stack.pop();
                    int b = stack.peek();
                    sum += a + b;
                    stack.push(a);
                    stack.push(a+b);
                    break;
                default:
                    int num = Integer.valueOf(ops[i]);
                    sum += num;
                    stack.push(num);
                    break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            String[] queries = new String[n];
            for (int i = 0; i < n; i++) {
                queries[i] = sc.next();
            }
            System.out.println(calPoints(queries));
        }
    }
}
