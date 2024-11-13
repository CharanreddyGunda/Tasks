package com.tekworks.day_3;
//238. Product of Array Except Self
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int leftProduct = 1;
        for(int i=0 ; i<nums.length ; i++) {
            result[i] = leftProduct;
            leftProduct = leftProduct*nums[i];
        }
        int rightProduct = 1;
        for(int i=nums.length-1 ; i>=0 ; i--) {
            result[i] = result[i]*rightProduct;
            rightProduct = rightProduct*nums[i];
        }
        return result;
    }
}
