package com.hackerrank.datastructures.stack;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class MaximumElement
{
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int N = s.nextInt();
            int max = 0;
            Stack<Integer> stack = new Stack();
            for (int i = 0;i < N; i++ ) {
                int query = s.nextInt();
                switch (query) {
                    case 1:
                        int num = s.nextInt();
                        if (max <= num) {
                            max = num;
                        }
                        stack.push(num);
                        break;
                    case 2:
                        if (!stack.isEmpty()) {
                            stack.pop();
                            // calculate a new max
                            max = 0;
                            for (Integer it : stack) {
                                if (max <= it.intValue()) {
                                    max = it.intValue();
                                }
                            }
                        } else {
                            max = 0;
                        }
                        break;
                    case 3:
                        System.out.println(max);
                        break;
                }
            }
        }
    }
}
