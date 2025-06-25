package com.ArrayConcepts;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		
		
		int arr[] = {36, 19, 29, 12, 5};
		
		int temp=0;
		int len = arr.length;
		
		for(int i=0; i<len; i++) {
			
			for (int j=0; j<len-1; j++) {
				
				if(arr[j]>arr[j+1]) {
					
					temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
					
				}
				System.out.println(arr[j]);
			}
		}
		
		for(int i=0; i<len; i++) {
			
			System.out.println("The accending order is :"+arr[i]);
			System.out.println("The second largest element is :"+ arr[1]);
		}
	}

}
