
public class RemoveDuplicatesInAString {

	public static void main(String[] args) {
		
		
		String sa = "My name is Sairam";
		
		
				char[] arr = sa.toCharArray();
				
				int len = sa.length();
				
				StringBuilder builder = new StringBuilder();
			    for(int i=0; i<len; i++) {
			    	
			    	boolean repeated = true;
			    	
			    	for(int j=i+1; j<len; j++) {
			    		
			    		if(arr[i]==arr[j]) {
			    			
			    			repeated = false;
			    			System.out.println("after  using boolean before break : "+ arr[i]);
			    			break;
			    			
			    		}
			    		System.out.println("after  using boolean after break : "+ arr[i]);
			    	}
			    	
			    	if(!repeated) {
			    		
			    		builder.append(arr[i]);
			    		
			    	}
			    	System.out.println("Removing duplicates :" + builder);
			    }
			
	                      
	}

}
