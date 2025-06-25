package com.String;

public class ReverseStringAndRemoveTheDuplicateWords {

	//String str="Java in java I am java"; reverse a string ,Remove duplicates words and count the duplicate words 
	public static void main(String[] args) {
		
		
		String str = "I am working in AUTOROX in Hyderabad i am ";
		
		int len= str.length();
		
		String reverse = "";
		
		String AfterRemove = "";
		for(int i=len-1; i>=0; i--) {
			
			reverse=reverse +str.charAt(i);
			
		}
      System.out.println(reverse);
      
      
   String[] SplitTheWord =  reverse.split(" ");
   
   for(int i=0; i<SplitTheWord.length; i++) {
	   
	   boolean repeatword = false;
	   
	   for(int j=0; j<i; j++) {
		   
		   if(SplitTheWord[i].equalsIgnoreCase(SplitTheWord[j])) {
			   
			   repeatword = true;
			   break;
		   }
		   
	   }
	   
	   if(!repeatword) {
		   
		   System.out.println(SplitTheWord[i]);
		   
		   AfterRemove  = AfterRemove +SplitTheWord[i]+ " ";
		   
		   System.out.println(AfterRemove);
	   }
   }
      
      
	}

}
