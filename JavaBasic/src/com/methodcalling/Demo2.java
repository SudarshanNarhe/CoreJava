package com.methodcalling;

import java.util.Scanner;

public class Demo2 {
	static void addNumber (float n1, float n2)
	{
		float sum;
		sum = n1+n2;
		System.out.println(sum);
	}
	
	static void diffNumber (int n1, int n2)
	{
		int diff;
	 	diff=n1-n2;
	 	System.out.println(diff);
	}
	static void checkoddEven (int n1)
	{
	     if(n1%2==0)
	    	 System.out.println("The number is even");
	     else 
	    	 System.out.println("The number is odd");
	}
	static void division(float n1, float n2)
	{
		float div= n1/n2;
		System.out.println(div);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a first number : ");
		int num1 =sc.nextInt();
		System.out.println("Enter a second Number : ");
		int num2=sc.nextInt();
				
//		int num1 = 45;
//		int num2 = 50;
		
		addNumber(num1,num2);
		addNumber(5,6);
		diffNumber(num1, num2);
		//checkoddEven(num1);
		division(num1, num2);
		sc.close();
	}

}
