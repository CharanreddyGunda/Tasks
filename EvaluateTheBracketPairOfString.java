package com.tekworks.day_3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//1807. Evaluate the Bracket Pairs of a String
public class EvaluateTheBracketPairOfString {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();

        for(List<String> entry : knowledge) {
            map.put(entry.get(0), entry.get(1));
        }
        StringBuilder output = new StringBuilder();
        int i= 0, len= s.length()-1;
        while(i<=len) {
            char c = s.charAt(i);
            if(c=='(') {
                int j=i+1;
                while(s.charAt(j)!=')') {
                    j++;
                }
                String key = s.substring(i+1,j);
                output.append(map.getOrDefault(key,"?"));
                i = j;
            }
            else{
                output.append(c);
            }
            i++;
        }
        return output.toString();
    }
}