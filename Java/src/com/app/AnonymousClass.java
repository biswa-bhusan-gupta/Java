package com.app;


// Functional Interface
interface Thar{
	void show();
}

class Scorpio{
	
	public void show() {
		System.out.println("Outside");
	}
	
}

public class AnonymousClass {

	public static void main(String[] args) {
		
		Scorpio obj1 = new Scorpio() {
			public void show() {
				System.out.println("Inside");
			}
		};
		obj1.show();
		
		Thar obj2 = () -> System.out.println("Inside"); // Lambda Expression
		obj2.show();
		
	}

}
