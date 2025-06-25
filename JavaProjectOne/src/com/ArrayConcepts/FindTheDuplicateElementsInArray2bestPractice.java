package com.ArrayConcepts;

public class FindTheDuplicateElementsInArray2bestPractice {

	public static void main(String[] args) {
		
int arr[] = {2,5,2,6,45,22,134,6,4,45};
		
		int len = arr.length;
		
		int duplicates =0;
		
		for(int i=0; i<len; i++) {
			
			boolean duplicate = false;
			
			for(int j=i+1; j<len; j++) {
				
				if(arr[i]==arr[j]) {
					
					duplicate = true;
					break;
				}
			}
			if(duplicate) {
				
				duplicates = arr[i];
				
				System.out.println(duplicates );
			}
		}

	}

}
