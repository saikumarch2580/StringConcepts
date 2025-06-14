package PracticeOne;

import java.util.Scanner;

public class RemoveDuplicateCharactersInAStringPracticeVeryImportant {

	public static void main(String[] args) {
	 
		System.out.println("Enter your name");
		Scanner Sc = new Scanner(System.in);
		String names = Sc.nextLine();
		
		Duplicates(names);
	}

	public static void Duplicates(String name) {
		
		String str = name;
		String temp ="";
		str = str.replace(" ", "");
		int length = str.length();
		int count =0;
		
		
		for(int i=0; i<length; i++) {
			
			for(int j=i+1; j<length; j++) {
				
				if(str.charAt(i)==str.charAt(j)) {
					
					temp = temp+str.charAt(j);
					count++;
					
				}
				
			}
			
		}
		System.out.println(temp);
		System.out.println("The total count is :"+ temp + "=" + count);
	}
}

