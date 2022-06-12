package com.app;

//By creating a class Abstract Class we cannot create Object of it but can create reference of it and if a method is abstract then that class should be abstract 
//if a Parent Class is Abstract and has a Abstract Method then the derived class must define the same method name otherwise it becomes abstract
//

abstract class Animal{
	
	public abstract void animalSound();
	
	public void sleep() {
		System.out.println("ZZZZZZZZZZ"); 	
	}
	
}

class Lion extends Animal{
	
	public void animalSound() {
		System.out.println("LLLLLLLLLL");
	}
}

class Tiger extends Animal {
	
	public void animalSound() {
		System.out.println("TTTTTTTTTT");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		
		Animal anm1 = new Lion();
		anm1.animalSound();
		anm1.sleep();
		
		Animal anm2 = new Tiger();
		anm2.animalSound();
		anm2.sleep();

	}

}
