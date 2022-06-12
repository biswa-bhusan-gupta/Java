package com.app;
import java.util.Scanner;

public class InputScanner {

	public static void main(String[] args) {
		
		int n;
		String s;
		float f;
		double d;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Int Number : ");
		n = sc.nextInt();
		
		System.out.println("Enter Name : ");
		s = sc.next();
		
		System.out.println("Enter a Float Number : ");
		f = sc.nextFloat();
		
		System.out.println("Enter a Double Number : ");
		d = sc.nextDouble();
		
		System.out.println(n);
		System.out.println(s);
		System.out.println(f);
		System.out.println(d);
		
	}
}