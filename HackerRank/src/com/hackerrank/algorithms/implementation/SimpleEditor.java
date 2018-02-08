package com.hackerrank.algorithms.implementation;

import java.util.Scanner;
import java.util.Stack;

public class SimpleEditor
{
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int q = scan.nextInt();
            Stack<StringBuffer> stack = new Stack<>();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < q; i++) {
                int op = scan.nextInt();
                switch(op) {
                    case 1:
                        stack.push(new StringBuffer(sb));
                        sb.append(scan.next());
                        break;
                    case 2:
                        stack.push(new StringBuffer(sb));
                        sb.delete(sb.length() - scan.nextInt(), sb.length());
                        break;
                    case 3:
                        System.out.println(sb.charAt(scan.nextInt() - 1));
                        break;
                    case 4:
                        sb = stack.pop();
                        break;
                }
            }
        }
    }
}
