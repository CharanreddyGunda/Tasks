package com.tekworks;

import java.util.HashSet;
import java.util.Set;

//1743. Restore the Array From Adjacent Pairs
public class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        Set<Integer> set = new HashSet<>();
        for(int i=0 ; i<adjacentPairs.length; i++) {
            for(int n : adjacentPairs[i]) {
                set.add(n);
            }
        }
        int[] nums = new int[set.size()];
        int index = 0;
        for(Integer n : set) {
            nums[index++] = n;
        }
        return nums;
    }
}