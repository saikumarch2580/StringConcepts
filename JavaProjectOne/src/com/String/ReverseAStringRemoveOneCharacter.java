package com.String;

public class ReverseAStringRemoveOneCharacter {

	public static void main(String[] args) {

		String str = "Madeam";
		
		String strNew ="";
		
		int strNewLength = strNew.length();
		
		
		int lenght = str.length();
		
		for(int i=0; i<lenght; i++) {
			
			if(str.charAt(i)!='e') {
				
				strNew = strNew+str.charAt(i);
				
		 
			}
			System.out.println(strNew);
			
		}
    
    	 
       }

	}


