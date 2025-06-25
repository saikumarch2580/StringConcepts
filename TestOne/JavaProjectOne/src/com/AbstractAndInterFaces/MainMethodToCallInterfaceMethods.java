package com.AbstractAndInterFaces;

public class MainMethodToCallInterfaceMethods {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.AnimalColour();
		d.lifeSpan();
		d.Sound();
		c.AnimalColour();
		c.lifeSpan();
		c.Sound();
		d.RobotCanSwim();
		d.RobotCanWalk();
		d.RobotDance();
		d.RobotDance();
	}

}
