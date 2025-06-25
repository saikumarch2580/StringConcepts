package com.String;

public class tomorrowTot3m3223w {
//Write a Java program for the given string transformation:
	//Input: tomorrow
	//Output: t3m3223w

	 public static void main(String[] args) {
		
        String str = "tomorrow";
        
       String repeate ="";
       
       int count =0;
        
       char[] strchar= str.toCharArray();
        
      int  len = str.length();
      
      for(int i=0; i<len; i++) {
    	  
    	  for(int j=0; j<i; j++) {
    	  
    	  if(strchar[i]==strchar[j]) {
    		  
    		  repeate = repeate+ strchar[j];
    		  
    		  count++;
    		  
    	  }
    	 
      }
    	  
	}
      System.out.println(repeate);
      System.out.println(count);
      
     
	}
}
