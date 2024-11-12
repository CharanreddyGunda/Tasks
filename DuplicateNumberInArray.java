package com.tekworks;

import java.util.Arrays;

public class DuplicateNumberInArray {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1 ; i<nums.length ; i++) {
            if(nums[i-1] == nums[i]) {
                return nums[i];
            }
        }
        return -1;
    }
}

/*
287. Find the Duplicate Number
 */