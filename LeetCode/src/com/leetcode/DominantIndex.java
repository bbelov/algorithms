package com.leetcode;

public class DominantIndex
{
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int maxIdx = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIdx = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != maxIdx && !(nums[i]*2 <= max)) {
                return -1;
            }
        }
        return maxIdx;
    }
}
