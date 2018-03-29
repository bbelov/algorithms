package com.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveAllElements {
    public static int removeElement(int[] nums, int value) {
        int newLen = nums.length, count = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] == value) {
                newLen--;
                count++;
            } else {
                nums[i-count] = nums[i];
            }
        }
        return newLen;
    }

    public static  void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int v = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i ++) {
                nums[i] = sc.nextInt();
            }
            int newLen = removeElement(nums, v);
            for (int i = 0; i < newLen; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }
    }
}
