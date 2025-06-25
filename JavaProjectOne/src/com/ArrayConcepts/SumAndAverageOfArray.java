package com.ArrayConcepts;

public  class SumAndAverageOfArray {

	public static void main(String[] args) {
		
		int arr[]= {3,5,7,32,75,245,43};
		
		int len= arr.length;
		int count = 0;
		
		int sumTotal=0;
		
		int avg = 0;
		
		for(int i=0; i<len; i++) {
			
		sumTotal = sumTotal+arr[i];
		count++;
		}
        
		System.out.println("Total sum is :"+ sumTotal );
		System.out.println("The count is :"+ count);
		
		avg = sumTotal/count;
		
		System.out.println("The avg is :"+ avg);
	}
 
}
