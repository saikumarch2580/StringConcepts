package com.java;

import java.util.Random;

public class AutogenerateString {

	public static void main(String[] args) {
		String characters = "abcdefghijklmnopqrstuvwxyz";
		
		int TotalLen = 5;
		
		Random rand = new Random();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<TotalLen; i++) {
			
			int newrand = rand.nextInt(TotalLen);
			System.out.println(newrand); 
			char newchar = characters.charAt(newrand);
			System.out.println(newchar); 
			StringBuilder abc = sb.append(newchar);
			System.out.println(abc);
			
		}
		
		
	
	}

}



/*char b = 0;

int a[] = new int[5];
Random ab = new Random();

int len = characters.length();

for(int i=0; i<len; i++) {
	
	b = characters.charAt(a[i]);

	System.out.println(b);
}

StringBuilder random = new StringBuilder();

for(int i=0; i<len; i++) {

StringBuilder chars = random.append(b);

System.out.println(chars);
} */