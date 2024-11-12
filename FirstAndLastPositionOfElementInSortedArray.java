package com.tekworks;


/*
34. Find First and Last Position of Element in Sorted Array 
 */
public class FirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
    
        result[0] = binarySearch(nums, target, true);
        if (result[0] != -1) {
            result[1] = binarySearch(nums, target, false);
        }
        return result;
    }

    private int binarySearch(int[] nums, int target, boolean findLeft) {
        int start = 0, end = nums.length - 1;
        int result = -1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (nums[mid] == target) {
                result = mid;
                if (findLeft) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return result;
    }
}


