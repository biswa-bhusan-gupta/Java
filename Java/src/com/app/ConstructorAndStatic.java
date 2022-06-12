package com.app;

class Alvin{
	
	int a;
	int b;
	static int value,Data; // Static Variables are Variables that stores same values for all the objects
	
	// Static Method : Loads when a class is called
	static {     
		Data=25;
	}
	
	public int getData() {
		int ret=a+b;
		return ret;
	}
	
	public int getData(int x,int y) {
		int res=x+y;
		return res;
	}
	
	public void getStaticData() {
		System.out.println(value);
	}
	
	public void getStat() {
		System.out.println(Data);
	}
}

class Cons{
     
	int p;
	int q;
	
	public Cons(){
	 p=5;
	 q=7;
	}
	
	public Cons(int p,int q) {
		this.p = p; // This represents Current Object
		this.q = q;
		
	}

	public int getRes(){
		int rex = p + q;
		return rex;
	}
}


public class ConstructorAndStatic {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Hello World");
			
			Alvin x = new Alvin();
			
			x.a=5;
			x.b=10;
			System.out.println(x.getData());
			System.out.println(x.getData(2,3));
			
			//Default Constructor
			Cons y = new Cons();
			System.out.println(y.p + " " + y.q);
			System.out.println(y.getRes());

        
			// Parameterized Constructor 
			Cons r = new Cons(8,9);
			System.out.println(r.p + " " + r.q);
			System.out.println(r.getRes());
			
			// Static Keyword
			Alvin obj1 = new Alvin();
			obj1.value=15;
			
			Alvin obj2 = new Alvin();
			obj2.value=11;
			
			Alvin.value=17;
			
			obj1.getStaticData();
			obj2.getStaticData();

			obj1.getStat();
			obj2.getStat();
			
			Alvin.Data=75;
			
			obj1.getStat();
			obj2.getStat();
	
		}

}



