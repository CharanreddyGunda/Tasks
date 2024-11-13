package com.tekworks.day_3;

//1980. Find Unique Binary String

public class UniqueBinaryString {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder binaryString = new StringBuilder();
        for(int i=0 ; i<nums.length ; i++) {
            if(nums[i].charAt(i) == '0') {
                binaryString.append('1');
            }
            else{
                binaryString.append('0');
            }
        }
        return binaryString.toString();
    }
}