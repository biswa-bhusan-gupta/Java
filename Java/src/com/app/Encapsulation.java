package com.app;

//Encapsulation : Data Members are kept Private(Hiding Sensitive Information from User) and are accessed by Public Member Functions, basically protects the data from direct modification
// --> Keep the Data Variables as private, Using public getter and setter methods to access and update the data

class Encaps{
	
	private String name;
	private int roll;
	
	// Using Getters and Setters
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRoll() {
		return roll;
	}
	
	public void setRoll(int roll) {
		this.roll = roll;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		
		Encaps enp = new Encaps();
		
		enp.setName("Biswa");
		enp.setRoll(1805030);

		System.out.println(enp.getName());
		System.out.println(enp.getRoll());
		
	}

}
