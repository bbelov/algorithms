package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i ++ ) {
            int delta = target - nums[i];
            if (map.containsKey(nums[i])) {
                return new int[] {map.get(nums[i]), i};
            }
            map.put(delta, i);
        }
        return new int[] { -1, -1};
    }

    public static  void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int t = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i ++) {
                nums[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(twoSum(nums, t)));
        }
    }
}
