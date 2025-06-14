package com.Exceptions;

public class HowToUseChinnUException {

	public static void main(String[] args) throws ChinnuException  {
		
		int age;
		
		age =5;
		
		if(age<18) {
			
			throw new ChinnuException("Your not eligible for the vote");
			
			
		} else {
			
			System.out.println("You are elegible for the vote");
		}
		
		}
	}
		
	



