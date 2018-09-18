package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character,Integer > romanInts = new HashMap<>();
        romanInts.put('I', 1);
        romanInts.put('V', 5);
        romanInts.put('L', 50);
        romanInts.put('D', 500);
        romanInts.put('M', 1000);
        romanInts.put('X', 10);
        romanInts.put('C', 100);

        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i+1 < s.length()) {
                char nextCh = s.charAt(i+1);
                if ((ch == 'I' && nextCh == 'V')
                    || (ch == 'I' && nextCh == 'X')
                    || (ch == 'X' && nextCh == 'L')
                    || (ch == 'X' && nextCh == 'C')
                    || (ch == 'C' && nextCh == 'D')
                    || (ch == 'C' && nextCh == 'M')) {
                    num += romanInts.get(nextCh) - romanInts.get(ch);
                    i++;
                } else {
                    num += romanInts.get(ch);
                }
            } else {
                num += romanInts.get(ch);
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(romanToInt(s.nextLine()));
        s.close();
    }
}
