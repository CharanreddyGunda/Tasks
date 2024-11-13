package com.tekworks.day_3;

import java.util.ArrayList;
import java.util.List;

//1249. Rearrange Array Elements by Sign
public class RearrangeArrayElementsBySign {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        for(int n : nums) {
            if(n>0) {
                positive.add(n);
            }
            else{
                negative.add(n);
            }
        }
        int[] reArrangedArray = new int[nums.length];
        int index = 0, i=0;
        while(i<positive.size()) {
            reArrangedArray[index++] = positive.get(i);
            reArrangedArray[index++] = negative.get(i++);
        }
        return reArrangedArray;
    }
}
