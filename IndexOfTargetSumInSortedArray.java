package com.tekworks;

//167 Two Sum - II - Input Array Is Sorted
public class IndexOfTargetSumInSortedArray {
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0 ; i<numbers.length-1 ; i++) {
            for(int j=i+1 ; j<numbers.length ; j++) {
                if((numbers[i] + numbers[j]) == target) {
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

/*
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length-1;
        while(start<=end) {
            int total = numbers[start]+numbers[end];
            if(total == target) {
                return new int[]{start+1, end+1};
            }
            if(total>target) {
                end--;
            }
            else{
                start++;
            }
        }
        return new int[]{-1,-1};
    }
}
*/
