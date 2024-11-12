
package com.tekworks;

import java.util.Arrays;
/*
 * 4. Median of Two Sorted Arrays(HARD)
 * */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = merge(nums1, nums2);
        int len = nums.length;
        if((len & 1) == 1) {
            return (double)nums[(len/2)];
        }
        else{
            return (nums[(len/2)-1] + nums[len/2])/2.0;
        }
    }
    public int[] merge(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length+nums2.length];
        int index = 0;
        for(int i=0 ; i<nums1.length ; i++) {
            nums[index++] = nums1[i];
        }
        for(int i=0 ; i<nums2.length ; i++) {
            nums[index++] = nums2[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}