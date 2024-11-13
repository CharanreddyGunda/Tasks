package com.tekworks.day_3;

//557. Reverse Words in a String 
public class ReverseWordsInString {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder reverse = new StringBuilder();
        for(String word : words) {
            reverse.append(reverseString(word)+" ");
        }
        reverse.deleteCharAt(reverse.length()-1);
        return reverse.toString();
    }

    public String reverseString(String s){
        StringBuilder reverse = new StringBuilder();
        for(int i=s.length()-1 ; i>=0 ; i--) {
            reverse.append(s.charAt(i));
        } 
        return reverse.toString();
    }
}
