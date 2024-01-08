package com.exception;

public class UseTry_Finally {

	public static void division(int n, int m) {
		
		int c= n/m;
		System.out.println(c);	
	}
	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		try {
			
			division(a, b);
			
		}
		finally {
			System.out.println("I am in finally...");
		}
		
	}
	
}
