package com.app;

class Smith{
	
	public int add(int ... i) {
		int sum=0;
		
		for(int n:i) {
			sum=sum+n;
		}
		return sum;
	}
}

public class Varags {
       public static void main(String[] args) {
    	   Smith obj = new Smith();
    	   System.out.println(obj.add(1,2,3,4,5));
       }
	
}
