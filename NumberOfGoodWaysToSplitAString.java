package com.tekworks.day_3;

import java.util.HashSet;
import java.util.Set;

//1525. Number of Good Ways to Split a String
public class NumberOfGoodWaysToSplitAString {
    public int numSplits(String s) {
        int goodSplit = 0;
        for(int i=0 ; i<s.length() ; i++) {
            if(sameCharacterCount(s.substring(0,i), s.substring(i,s.length()))) {
                goodSplit++;
            }
        }
        return goodSplit;
    }

    private boolean sameCharacterCount(String s1, String s2) {
        Set<Character> setS1 = new HashSet<>();
        for(char ch : s1.toCharArray()) {
            setS1.add(ch);
        }
        Set<Character> setS2 = new HashSet<>();
        for(char ch : s2.toCharArray()) {
            setS2.add(ch);
        }
        return setS1.size() == setS2.size();
    }
}