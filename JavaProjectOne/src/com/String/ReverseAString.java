package com.String;

public class ReverseAString {

	public static void main(String[] args) {


		String str = "My name is Sairam";
		
		String rev = "";
		
		int len= str.length();
		
		for(int i=len-1; i>=0; i--) {
			
			rev = rev+str.charAt(i);
			
		}
      
		System.out.println(rev);
	}

}
