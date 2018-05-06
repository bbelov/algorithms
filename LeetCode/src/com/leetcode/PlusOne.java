package com.leetcode;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry  =1;
        for (int i = digits.length -1; i >= 0 && carry != 0; i--) {
            int plusOne = digits[i] + carry;
            digits[i] = plusOne % 10;
            carry = plusOne / 10;
        }

        if (carry != 0) {
            int[] newDigits = new int[digits.length + 1];
            System.arraycopy(digits, 0, newDigits, 1, digits.length);
            newDigits[0] = carry;
            return newDigits;
        }
        return digits;
    }
}
