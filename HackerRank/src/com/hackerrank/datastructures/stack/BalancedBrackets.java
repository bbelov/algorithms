package com.hackerrank.datastructures.stack;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedBrackets
{
    static String isBalanced(String s) {
        Stack<Character> brackets = new Stack<>();

        if (s == null || (s != null && s.isEmpty())) {
            return "NO";
        }
        byte[] chars = s.getBytes();
        for (int i =0; i < chars.length; i ++) {
            if (isOpeningBracket(chars[i])) {
                brackets.push(Character.valueOf((char)chars[i]));
            } else if (isClosingingBracket(chars[i])){
                try {
                    if (isMatchingBracket(chars[i], brackets)) {
                            brackets.pop();
                    }
                } catch (EmptyStackException e) {
                    return "NO";
                }
            }
        }
        if (brackets.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }

    private static boolean isOpeningBracket(byte c) {
        return (c == '{' || c == '[' || c == '(');
    }

    private static boolean isClosingingBracket(byte c) {
        return (c == '}' || c == ']' || c == ')');
    }

    private static boolean isMatchingBracket(byte c, Stack<Character> s) {
        Character b = null;
        switch(c) {
            case ']':
                b = Character.valueOf('[');
                break;
            case '}':
                b = Character.valueOf('{');
                break;
            case ')':
                b = Character.valueOf('(');
                break;
        }
        if (s.peek().equals(b)) {
            return true;
        } else {
            return false;
        }
    }
}
