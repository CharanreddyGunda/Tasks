package com.tekworks;

//2295. Replace Elements in an Array
public class ReplaceElementsInArray {
    public int[] arrayChange(int[] nums, int[][] operations) {
        for(int i=0 ; i<operations.length ; i++) {
            replace(nums, operations[i][0], operations[i][1]);
        }
        return nums;
    }

    public void replace(int[] nums, int oldValue, int newValue) {
        for(int i=0 ; i<nums.length ; i++) {
            if(nums[i]==oldValue) {
                nums[i] = newValue;
                return;
            }
        }
    }
}

/*
class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<nums.length; i++) {
            map.put(nums[i], i);
        }

        for(int i=0 ; i<operations.length ; i++) {
            int index = map.get(operations[i][0]);
            nums[index] = operations[i][1];

            map.put(nums[index], index);
            map.remove(operations[i][0]);
        }
        return nums;
    }
}
*/