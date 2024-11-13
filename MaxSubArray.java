package com.tekworks.day_3;

public class MaxSubArray {
	public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = 0;
        for(int i=0 ; i<nums.length ; i++) {
            sum = sum + nums[i];
            if(maxSum<sum) {
                maxSum = sum;
            }
            if(sum<0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}
