package com.String;

public class FindingVowelsInAstring {

	public static void main(String[] args) {
		
	 String str = "CHINNU NAME IS SAIRITWIKA";
	 int vowels = 0;
	 int consonents =0;
	 int count =0;
	 
	 str = str.toLowerCase();
	 
	 for(int i=0; i<str.length(); i++) {
		 
		 if(str.charAt(i)!=' ') {
			 count++;
			 
		 }
	 }
	 
	 
	 
	 for(int i=0; i<str.length(); i++)
	 {
		if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
			
			vowels++;
			
		} else {
			consonents++;
			
		}
			
		}
	    System.out.println(count);
	    System.out.println(vowels);
	    System.out.println(consonents);
			
		}
		 
	 
	

}
