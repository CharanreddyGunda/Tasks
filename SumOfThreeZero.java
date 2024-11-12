package com.tekworks;

import java.util.ArrayList;
import java.util.List;

/*
 * 15 leetcode problem
 */
public class SumOfThreeZero {
    public List<List<Integer>> threeSum(int[] nums) {
        boolean zeroFlag = false;
        List<List<Integer>> triplets = new ArrayList<>();
        for(int i=0 ; i<nums.length-2 ; i++) {
            for(int j=i+1 ; j<nums.length-1; j++) {
                for(int k=j+1 ; k<nums.length ; k++){
                    if((nums[i]+nums[j]+nums[k])==0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        if(nums[i] == 0 && nums[j] ==0 && nums[k] == 0 && !zeroFlag) {
                            triplets.add(list);
                            zeroFlag = true;
                            continue;
                        }
                        if(!isListContainsSameSet(triplets,list)){
                            triplets.add(list);
                        }       
                    }
                }
            }
        }
        return triplets;
    }
    
    public boolean isListContainsSameSet(List<List<Integer>> triplets, List<Integer> elements) {
        boolean flag= false;
        for (List<Integer> list : triplets) {
            if (list.containsAll(elements)) {
                return true;
            }
        }
        return flag;
    }
}

