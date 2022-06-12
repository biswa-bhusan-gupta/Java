package com.app;


class Outer{
	
    int x = 45;
    static int z = 15; 
	
	public void outerShow(int n){
        x=n;
		System.out.println("In Outer Class " + x);
	}
	
	// Method Class
	class Inner{
		int y;
		
		public void innerShow() {
	    y = 25;
		System.out.println("In Inner Class " + y);
			
		}
	}
	
	// Static Class
	static class StaticInnerClass{
		
		public void staticInnerShow() {
			System.out.println("In Static Inner Class " + z);
		}
		
	}
}


public class InnerClass {
	
  public static void main(String args[]) {
	  Outer obj1 = new Outer();
	  Outer.Inner obj2 = obj1.new Inner();
	  Outer.StaticInnerClass obj3 = new Outer.StaticInnerClass();
	  
	  obj1.outerShow(5);
	  obj2.innerShow();
	  obj3.staticInnerShow();
	  
  }
}
