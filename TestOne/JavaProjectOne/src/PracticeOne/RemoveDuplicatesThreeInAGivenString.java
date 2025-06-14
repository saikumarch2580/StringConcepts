package PracticeOne;

import java.util.Scanner;

public class RemoveDuplicatesThreeInAGivenString {

	public static void main(String[] args) {
		
		String name ;
		
		String temp ="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name : ");
		name = sc.nextLine();
		char[] arr=  name.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			
			String k = name.charAt(i)+"";
			if(!temp.contains(k)) {
				
				temp = temp+k;
				
				
				
			}
			sc.close();
		}
		System.out.println(temp);
	}

}
