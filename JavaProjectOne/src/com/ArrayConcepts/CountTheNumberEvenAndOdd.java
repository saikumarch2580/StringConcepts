package com.ArrayConcepts;

public class CountTheNumberEvenAndOdd {

	public static void main(String[] args) {
		
		int arr[]= {3,5,7,32,75,245,43};
		
		int even =0;
		
		int len = arr.length;
		int oddnum =0;
		
		 for(int i=0; i<len; i++) {
			 
			 if(arr[i]%2==0) {
				 
              even=even+ arr[i];
				 
			 } else {
				 
				 oddnum=oddnum+ arr[i];
			 }
			
			 System.out.println("Even numbers are "+ even);
			 System.out.println("Odd numbers are"+ oddnum);	
		 }
			 
		
		 }
	}


