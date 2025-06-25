package com.Constructors;

public class ConstructorsOverloading {
	
	String name;
	int age;
	
	ConstructorsOverloading(){
		
		System.out.println("This is default constructor");
		
	}
	
	ConstructorsOverloading(String name){
		
		this.name = name;
		System.out.println("The name is "+name);
	}
	
	ConstructorsOverloading(String name, int age){
		
		this.name = name;
		this.age = age;
		System.out.println("The name and age is " + name  + " and age is" +  age);
		
	}
	

	
	

	public static void main(String[] args) {
		
		ConstructorsOverloading s1 = new ConstructorsOverloading();
		ConstructorsOverloading s2 = new ConstructorsOverloading("sai");
		ConstructorsOverloading s3 = new ConstructorsOverloading("sai", 20);
	
		
		
	}

}
