package com.String;

public class I_Love_Java_Programming_Reverse_Programming {

	public static void main(String[] args) {
		
		String str = "I Love Java Programming";
		
		int len= str.length();
		
		String[] split = str.split(" ");
		
		String temp =" ";
		
			for(int i=0; i<split.length; i++) {
			
			if(i==split.length-1) {
				
				for(int j=split[i].length()-1; j>=0; j--) {
					
					temp=temp+split[i].charAt(j);
				}
				temp =temp+" ";
			} else
			temp= temp+split[i]+ " ";
		}
		
		System.out.println(temp);
	}

}
