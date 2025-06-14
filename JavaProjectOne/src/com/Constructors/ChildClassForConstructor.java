package com.Constructors;

public class ChildClassForConstructor extends CanWeOverrideAConstructor{
	
/*	public ChildClassForConstructor() {
		
		super();
		System.out.println("This is child class");
		
	} */
	
//public  CanWeOverrideAConstructor() {
		
		
//		System.out.println("This is parent class");
//	}
	
	
public static void login() {
		
		
		System.out.println("child Login succsfully");
	}
	

	public static void main(String[] args) {
		
		ChildClassForConstructor child = new ChildClassForConstructor();
		System.out.println(child);
		
		CanWeOverrideAConstructor parent = new CanWeOverrideAConstructor();
		CanWeOverrideAConstructor parentone =  new ChildClassForConstructor();
		
		parent.login();
		parentone.login();
	}
	

}


