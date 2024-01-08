package com.exception;

//WAP to catch multiple exceptions. i.e ArrayIndexOutOfBoundsException and ArithmeticException

public class MultipleException {

	public static void showArray(int num[]) {
		
		for(int i=0;i<=num.length;i++) {
			System.out.println(num[i]);
		}
	}
	public static void division(int n, int m) {
		
		int c= n/m;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		System.out.println("main starts...");
		int arr[]= {1,2,3,4,5,6};
		int a=10;
		int b=0;
		try {
			division(a, b);
			showArray(arr); 
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic");
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayOut");
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
		 
		System.out.println("main ends...");
	}
	
}
