package com.String;


//String str="Java in java I am java"; reverse a string ,Remove duplicates words and count the duplicate words 
public class ReverseAndDuplicateWords {

	public static void main(String[] args) {
		
		String str = "Java in java I am java and java";
		
		String[] splitTheWord = str.split(" ");
		int count =0;
		
	String 	reverse = "";
		
		int len = splitTheWord.length;
		
		for(int i=0; i<len; i++) {
			
			boolean repeated = false;
			for(int j=0; j<i; j++) {
				
				if(splitTheWord[i].equalsIgnoreCase(splitTheWord[j])) {
					
					repeated=true;
					count++;
					break;
					
				}
				
				
			}
				
			if(!repeated) {
				
				reverse= reverse +splitTheWord[i]+" ";
			}
			
		}
		System.out.println(reverse);
		System.out.println("The count is:"+ count);
      
	}

}
