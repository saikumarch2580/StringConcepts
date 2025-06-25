package com.AbstractAndInterFaces;

public class Cat implements Animal {

	@Override
	public void Sound() {
		System.out.println("This sound will be Meyaw");
		
	}

	@Override
	public void AnimalColour() {
		System.out.println("The cat color will be either brown, red or orange");
		
	}

	@Override
	public void lifeSpan() {
		System.out.println("The cat life span will be may be 4 years");
		
	}



}
