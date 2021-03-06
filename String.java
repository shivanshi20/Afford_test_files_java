package myPackage;

import java.io.*;
import java.util.*;


class Solution {
public  boolean isValid(String input) {

Map<Character, Character> map = new HashMap<>();
    map.put('<', '>');
    map.put('{', '}');
    map.put('[', ']');
    map.put('(', ')');
 
 Stack<Character> stack = new Stack<>();
 
 for(char ch : input.toCharArray()){
     if(map.containsKey(ch)){
         stack.push(ch);
     } else if(!stack.empty() && map.get(stack.peek())==ch){
         stack.pop();
     } else {
         return false;
     }
 }
 return stack.empty();
}
}

public class User{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String brackets = sc.nextLine();
		Solution obj = new Solution();
		obj.isValid(brackets);
	}
}
