package com.tekworks.day_3;

//1750. Minimum Length of String After Deleting Similar Ends 
public class MinimumLengthOfStringAfterDeletingSimilarEnds {
    public int minimumLength(String s) {
        int start = 0, end = s.length()-1;
        while(start<end && s.charAt(start) == s.charAt(end)) {
            char ch = s.charAt(start);
            while(start<=end && s.charAt(start) == ch){
                start++;
            }
            while(start<=end && s.charAt(end) == ch) {
                end--;
            }
        }
        return end-start+1;
    }
}
