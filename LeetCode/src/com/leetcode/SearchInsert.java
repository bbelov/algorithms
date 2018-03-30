package com.leetcode;

import java.util.Scanner;

public class SearchInsert {
    public static int searchInsert(int[] nums, int target) {
        int i;
        for(i = 0; i < nums.length; i++) {
            if (nums[i] >= target ) {
                break;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int target = sc.nextInt();
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i ++) {
                nums[i] = sc.nextInt();
            }
            System.out.println(searchInsert(nums, target));
        }
    }
}
