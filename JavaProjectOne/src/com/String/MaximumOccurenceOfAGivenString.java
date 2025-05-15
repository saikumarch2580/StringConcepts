package com.String;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccurenceOfAGivenString {

	public static void main(String[] args) {
		
		String si = "My name is Sairam";
		char[] arr = si.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		
		for(Character ch:arr) {
			
			if(!map.containsKey(ch) ) {
			
				//if the character occurence for 1time, it will store map.put(ch, 1) thats way we put 1 here
				
				map.put(ch, 1);
				
			}else
			{
				//if the character occurence for multiple times, it will store map.put(ch, count+1)
				int count = map.get(ch);
				map.put(ch, count+1);
			}
			
			
		}
		
		System.out.println(map);

	}

}
