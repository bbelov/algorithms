package com.hackerrank.datastructures.stack;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LargestRectangle
{
    static long largestRectangle(int[] h) {
        Stack<Integer> stack = new Stack<>();
        int largest = 0;
        int top, maxArea, i = 0;
        for (; i < h.length;) {
            if (stack.isEmpty() || (!stack.isEmpty() && h[stack.peek()] <= h[i])) {
                stack.push(i++);
            } else {
                top = stack.pop();
                maxArea = h[top] * (stack.isEmpty() ? i : i - stack.peek() - 1);
                largest = Math.max(largest, maxArea);
            }
        }
        while (!stack.isEmpty()) {
            top = stack.pop();
            maxArea = h[top] * (stack.isEmpty() ? i : i - stack.peek() - 1);
            largest = Math.max(largest, maxArea);
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] h = new int[n];
        for(int h_i = 0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        long result = largestRectangle(h);
        System.out.println(result);
        in.close();
    }
}
