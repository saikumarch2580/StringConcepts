package com.AbstractAndInterFaces;

public class Dog implements Animal, Robot {

	@Override
	public void Sound() {
		System.out.println("Dog is Barking");
		
	}

	@Override
	public void AnimalColour() {
		System.out.println("This color might be black or brown");
		
	}

	@Override
	public void lifeSpan() {
		System.out.println("May be 10 or 12 years");
		
	}

	@Override
	public void RobotCanWalk() {
		System.out.println("Robot can walk");
		
	}

	@Override
	public void RobotCanSwim() {
		System.out.println("Robot swim");
		
	}

	@Override
	public void RobotDance() {
	 System.out.println("Robot dance");
		
	}

}
