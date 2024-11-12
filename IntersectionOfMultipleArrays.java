package com.tekworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//248. Intersection of Multiple Arrays
public class IntersectionOfMultipleArrays {
    public List<Integer> intersection(int[][] nums) {
        Set<Integer> commonNumbers = new HashSet<>();
        for(int n : nums[0]) {
            commonNumbers.add(n);
        }

        for(int i=1 ; i<nums.length; i++) {
            Set<Integer> set = new HashSet<>();
            for(int n : nums[i]) {
                set.add(n);
            }
            commonNumbers.retainAll(set);
        }
        List<Integer> distinctNumbers = new ArrayList<>(commonNumbers);
        Collections.sort(distinctNumbers);
        return distinctNumbers;
    }
}
