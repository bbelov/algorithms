package com.leetcode;

public class ProductOfIntegers {
    public static int[] getProductOfIntegersWithDivision(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        int[] products = new int[nums.length];
        int totalProduct = 1;
        for (int n : nums) {
            totalProduct *= n;
        }

        for (int i = 0; i < nums.length; i++) {
            products[i] = totalProduct/nums[i];
        }
        return products;
    }

    public static int[] getProducstOfIntegersWithouDivision(int[] nums) {
        int product = 1;
        // products below each index
        int[] products = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = product;
            product *= nums[i];
        }

        // product above each index
        product = 1;
        for (int i = nums.length -1; i >= 0; i--) {
            nums[i] *= product;
            product *= nums[i];
        }
        return products;
    }
}
