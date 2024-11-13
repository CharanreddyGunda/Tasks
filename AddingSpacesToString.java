package com.tekworks.day_3;

//2109. Adding Spaces to a String
public class AddingSpacesToString {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder(s);
        int spaceCount = 0;
        for(int space : spaces) {
            sb.insert((space+spaceCount++),' ');
        }
        return sb.toString();
    }
}