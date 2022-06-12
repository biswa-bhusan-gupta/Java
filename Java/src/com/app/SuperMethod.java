package com.app;

//Multiple Inheritance leads to Ambiguity so,we use Super Keyword to avoid Method Overriding

class A{          // Parent Class / Super Class
	
	 A() {
		 System.out.println("In Super Class");
	 } 

	 A(int i) {
		 System.out.println("Int Value of Super Class : " + i);
	 } 
	 
	 public void func() {
		 System.out.println("Inside Method of Super Class");
	 }
	 
	 
	 public void meth() {
		 System.out.println("No Method in Sub class");
	 }
	 
	 
}

class B extends A{ // Child Class / Sub Class of Inhert1
	
	 B() {
		 System.out.println("In Sub Class");
	 }

	 B(int i) {
		 super(i);
		 System.out.println("Int Value of Sub Class : " + i);
	 } 
	 
	 public void func() {
		 super.func();
		 System.out.println("Inside Method of Sub Class");
	 }
	
}

public class SuperMethod {

	public static void main(String[] args) {
		
		B obj1 = new B();
		B obj2 = new B(5);
		
		obj1.func();
		
		A obj3 = new B(); // We can have this type of references and objects,if both classes have same methods or only parent class has a method not present in sub class ....obj3 references A but Object of B....Without Super Keyword,The Object of B(obj3) outputs Base Class Method
		// Obj3 checks whether methods present in A are present in B or not
		obj3.func();
		obj3.meth();

	}

}
