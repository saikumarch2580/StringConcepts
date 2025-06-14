package Main;

public class ArrayAverage {

	public static void main(String[] args) {
		int array[] = {2,32,234,21,190,76};
		
		
		
     	int	sum1=0;
     	int count=0;
	    
     	for(int i=0; i<array.length; i++) {
     		
     		sum1 = sum1+ array[i];
     		
     		  count++;
     	}
		
     	float avg = sum1/count;
     	
System.out.println(sum1);
System.out.println(count); 
System.out.println(avg);
	}

}
