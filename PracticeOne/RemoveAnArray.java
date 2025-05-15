package PracticeOne;

public class RemoveAnArray {

	public static void main(String[] args) {
		
		int a[] = {1,3,4,7,89,64,33};
		
		int remove = 89;
		
		
		
		int count = 0;
		for(int i=0; i<a.length; i++) {
			
			if(a[i]==remove) {
				
				count++;
				
			}
		}
			int temp[]  = new int[a.length - count];
			int j=0;
			    
				for (int i=0; i<a.length; i++ ) {
					
					if(a[i]!=remove) {
						
						temp[j]=a[i];
						j++;
					}
					System.out.println(temp[j]);
				}
				
				
			
			System.out.println("count is    : "+count);
		
	for (int i = 0; i < temp.length; i++) {
        System.out.println(temp[i]);
    }
	
	}

}
