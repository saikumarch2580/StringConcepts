package Main;

import java.util.Arrays;

public class RemoveAarray {

	public static void main(String[] args) {
	int[] arr = {2,42,43,55,53};
	
	System.out.println(Arrays.toString(arr));
	
    int remv = 43;
    
    for(int i=0; i<arr.length; i++) {
    	
    	if(remv==arr[i]) {
    		
    		for(int j=i; j<arr.length-1; j++) {
    			
    		int c=	arr[j]= arr[j+1];
    		
    		
			System.out.println(c);
    		}	
    	}
    	
    }
    
    for(int i = 0; i<arr.length-1; i++) {
		
		System.out.println("Latest arrays are " + arr[i]);
	}

	}
	}
