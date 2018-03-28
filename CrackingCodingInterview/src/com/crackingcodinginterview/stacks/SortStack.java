package com.crackingcodinginterview.stacks;

import java.util.Stack;

public class SortStack
{
    public void sort(Stack<Integer> s1) {
        Stack<Integer> sorted = new Stack<>(); // sorted in ascending order
        while (!s1.isEmpty()) {
            int tmp = s1.pop();
            while(!sorted.isEmpty()  && tmp < s1.peek()) {
                s1.push(sorted.pop());
            }
            s1.push(tmp);
        }
    }
}
