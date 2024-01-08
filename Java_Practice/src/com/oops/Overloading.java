package com.oops;

public class Overloading {

	public static void addition(int a, int b) {
		System.out.println("Addition is : "+(a+b));
	}
	public static void addition(double a, int b) {
		System.out.println("Addition is : "+(a+b));
	}
	public static void main(int a, int b, int c) {
		
		System.out.println("Addition is : "+(a+b+c));
	}
	
	public static void main(String []args) {
		
		addition(3, 4);
		addition(3.0, 4);
		main(1,2,3);
	}
	
}
