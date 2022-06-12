// Any Method declared inside Interface is Public Abstract
// We cannot create object of Interface,we can only create reference of Interface
// Abstract class can contain Abstract Methods and Non Abstract Methods whereas in Interface Interface Class contains Abstract Methods only
// Any Variable inside Interface is Final Variable


package com.app;

interface Anm {
	
	void animalSound();
	void sleep();

}

class Ln implements Anm{
	
	public void animalSound() {
		System.out.println("LLLLLLLLLL");
	}
	
	public void sleep() {
		System.out.println("NNNNNNNNNN"); 	
	}
	
}

class Tr implements Anm {
	
	public void animalSound() {
		System.out.println("TTTTTTTTTT");
	}
	
	public void sleep() {
		System.out.println("RRRRRRRRRR"); 	
	}
	
}


// xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx //

// Inheritance :

interface AnimalEat {
	 void eat();
}

interface AnimalTravel {
	  void travel();
}

class Animals implements AnimalEat, AnimalTravel {
	
	   public void eat() {
	      System.out.println("Animal is Eating");
	   }
	   
	   public void travel() {
	      System.out.println("Animal is Travelling");
	   }
	   
}



public class Interface {

	public static void main(String[] args) {
		

		Anm anm1 = new Ln();
		anm1.animalSound();
		anm1.sleep();
		
		Anm anm2 = new Tr();
		anm2.animalSound();
		anm2.sleep();
		
		Animals anm = new Animals();
		anm.eat();
		anm.travel();

	}

}
