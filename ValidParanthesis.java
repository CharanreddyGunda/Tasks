package com.tekworks;

import java.util.*;
public class ValidParanthesis{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String input = sc.next();
             System.out.println(input);
            System.out.println(isValidParanthesis(input.trim()));
		}		
        sc.close();
	}
    
    public static boolean isValidParanthesis(String str){
        Stack<Character> stack = new Stack<>();
            for(char c : str.toCharArray()){
                if(c=='{' || c == '(' || c=='[') {
                    stack.push(c);
                }
                else if(c==')' && !stack.isEmpty() && stack.peek() =='(') {
                    stack.pop();
                }
                else if(c==']' && !stack.isEmpty() && stack.peek() =='[') {
                    stack.pop();
                }
                else if(c=='}' && !stack.isEmpty() && stack.peek() =='{') {
                    stack.pop();
                }
                else{
                    System.out.println(c);
                    return false;
                }
        } 
        return stack.isEmpty();
    }
}

