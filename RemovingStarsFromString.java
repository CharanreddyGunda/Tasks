package com.tekworks.day_3;

public class RemovingStarsFromString {
    public String removeStars(String s) {
        StringBuilder output = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(c!='*') {
                output.append(c);
            }
            else{
                output.deleteCharAt(output.length()-1);
            }
        }
        return output.toString();
    }
}