package com.tekworks.day_3;

//151. Reverse Words in a String
public class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder reverseWords = new StringBuilder();
        for(int i=words.length-1 ; i>=0 ; i--) {
            reverseWords.append(words[i]+" ");
        }
        reverseWords.deleteCharAt(reverseWords.length()-1);
        return reverseWords.toString().trim();
    }
}