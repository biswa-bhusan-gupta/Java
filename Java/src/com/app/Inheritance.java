package com.app;

//Multiple Inheritance is not supported by Java


class Inhert1{          // Parent Class / Super Class
	
	public int add(int n1,int n2) {
		return n1+n2;
	}
	
}

class Inhert2 extends Inhert1{ // Child Class / Sub Class of Inhert1
	
	public int subs(int n1,int n2) {
		return n1-n2;
	} 
	
}

class Inhert3 extends Inhert2{ // Child Class / Sub Class of Inhert2
	
	public int mul(int n1,int n2) {
		return n1*n2;
	} 
	
}

public class Inheritance {    
  public static void main(String[] args) {
 	 
 	 
 	 Inhert3 inh = new Inhert3();
 	 int result1 = inh.add(5,4); 
 	 int result2 = inh.subs(5,4);
 	 int result3 = inh.mul(5,4);
 	 
 	 System.out.println(result1);
 	 System.out.println(result2);
 	 System.out.println(result3);

 	 
  }
}
