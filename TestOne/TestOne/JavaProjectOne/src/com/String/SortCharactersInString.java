package com.String;

import java.util.Arrays;

public class SortCharactersInString {

	public static void main(String[] args) {
 	sortString();
		
		
	}
	
		public static String sortString() {
		String st = "Sairam is a good boy";
		st = st.replace(" ", "");
		
		String[] split = st.split("");
		
		Arrays.sort(split);
		
		StringBuilder sb = new StringBuilder();
		
		for( String ch:split) {
			
			sb.append(ch);
			
		}
		
		System.out.println(sb);
     return sb.toString();
     
	}
		
}
