package com.String;

public class CountAndPrintNumberOfA {

	public static void main(String[] args) {
		String s = "Java";
		
		int length = s.length();
		int count = 0;
		
		char[] arr = s.toCharArray();
		
		for(char ch:arr) {
			
			if(ch=='a') {
				
				count++;
				
			}
			
		}
		
		System.out.println("The total count is :" + count);
	}

}
