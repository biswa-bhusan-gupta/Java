package com.app;


//If a Variable becomes Final its value becomes constant throughout that Class


class Final1{
	
	final int x = 25; // CONSTANT
	
	public final void get() {
		System.out.println(x);
	}
	
}

class Final2 extends Final1{ 
	
	int x = 35;
	
	public void getValue() { // // only in Inheritance If a Parent Class Method is Final then no Overriding is possible 
		System.out.println(x);
	}
}

public class FinalVariableMethod {

	public static void main(String[] args) {
		
		Final1 obj1 = new Final1();
		obj1.get();
		
		Final2 obj2 = new Final2();
		obj2.getValue();

	}

}
