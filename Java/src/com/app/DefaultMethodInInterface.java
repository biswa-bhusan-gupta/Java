package com.app;

interface App1{
	
	void get1();
	default void get2() {   --> It does not force implementing classes to override the method
		System.out.println("In Get2");
	}
	
}

class App2 implements App1{
	
	public void get1() {
		System.out.println("In Get1");
	}
	
}
public class DefaultMethodInInterface {

	public static void main(String[] args) {
		App1 obj1 = new App2();
		obj1.get1();
		obj1.get2();
	}

}
