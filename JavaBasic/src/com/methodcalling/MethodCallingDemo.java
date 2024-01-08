package com.methodcalling;

public class MethodCallingDemo {      //Demo parameters
	static void callbyValue(int n1, int n2)
	{
		System.out.println("In method before :");
		System.out.println(n1+ "  " +n2);
		n1=n1+3;
		n2=n2+5;
		System.out.println("In method after :");
		System.out.println(n1+ "  " +n2);
	}
	public static void main(String[] args) {    //Actual parameters 
		int num1 = 23;
		int num2 = 43;
		System.out.println("In main before : ");
		System.out.println(num1+ "  " +num2);
		callbyValue(num1,num2);
		System.out.println("In main after : ");
		System.out.println(num1+ "  " +num2);
	
	}

}
