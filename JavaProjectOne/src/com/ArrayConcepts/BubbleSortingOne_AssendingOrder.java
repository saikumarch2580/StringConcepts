package com.ArrayConcepts;

public class BubbleSortingOne_AssendingOrder {

	public static void main(String[] args) {
		
		int arr[] = {36, 19, 29, 12, 5};
		
		int length = arr.length;
		
		int temp=0;
		for(int i=0; i<length; i++) {
			
			int flat =0;
			for(int j=0; j<length-1; j++) {
				
				if(arr[j]> arr[j+1]) {
					
				   
					temp =arr[j];
					
					arr[j]= arr[j+1];
					
					arr[j+1]=temp;
					
					flat =1;
					
				}
				
				System.out.println("The value is "+ arr[j]);
			}
			
			if(flat ==0) {
				
				
				break;
				
				
			}
			
		}
		
		for(int i=0; i<length; i++) {
			
			System.out.print(arr[i]+ " ");
		}
	}

}
