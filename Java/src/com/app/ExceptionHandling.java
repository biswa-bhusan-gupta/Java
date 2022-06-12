package com.app;

public class ExceptionHandling {

	public static void main(String[] args){
		
		try {
			int i=9/0;
			int a[] = new int[6];
			a[6]=25;
			
			System.out.println("Output : " + i);
		}
		
		catch(Exception e) {
			System.err.println("Error");
		}
		
		finally {
			System.out.println("End");
		}
		
		System.out.println("Adios");
		
	}

}
