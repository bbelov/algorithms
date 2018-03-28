package com.crackingcodinginterview.stacks;

import java.util.Scanner;
import java.util.Stack;

public class MinStack
{
    class Node {
    int value;
    int minimum;

    Node(int num, int min) {
        value = num;
        minimum = min;
    }
}
    private Stack<Node> stack = new Stack<>();

    /** initialize your data structure here. */
    public MinStack() {
    }

    public void push(int x) {
        int min = Math.min(x, getMin());
        stack.push(new Node(x, min));
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().value;
    }

    public int getMin() {
        return (stack.isEmpty() ? Integer.MIN_VALUE : stack.peek().minimum);
    }

    public  static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int queries = sc.nextInt();
            MinStack stack = new MinStack();
            for (int i = 0; i < queries; i ++) {
                switch (sc.nextInt()) {
                    case 1:
                        stack.push(sc.nextInt());
                        break;
                    case 2:
                        stack.pop();
                        break;
                    case 3:
                        System.out.println(stack.top());
                        break;
                    case 4:
                        System.out.println(stack.getMin());
                        break;
                }
            }
        }
    }
}
