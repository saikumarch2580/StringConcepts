package com.ArrayConcepts;

public class SortAnArray {

	public static void main(String[] args) {
		
        int arr[] = {2,5,8,54,45,22,134,6,4,445};
		
		int len = arr.length;
		
		int temp =0;
		
		for(int i=0; i<len; i++) {
			
			for(int j=0; j<len; j++) {
				
				if(arr[i]<arr[j]) {
					
				temp =	arr[i];
				
				arr[i]=arr[j];
				
				arr[j]= temp;
				
				
				}
			}
		}
		for(int i=0; i<len; i++) {
			
			System.out.println(arr[i]);
		}
	}

}
