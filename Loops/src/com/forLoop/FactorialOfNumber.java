package com.forLoop;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a any number : ");
		int num = sc.nextInt();
		long fact=1;
		for (int i=1;i<=num;i++)
		{
			fact*=i; //fact=fact*i;
			//System.out.println(fact);
		}
		System.out.println("Factorial of "+num+" is :"+fact);
		//OR
		fact = 1;
		for (int i=num;i>0;i--)
		{
			fact*=i;
			//System.out.println(fact);
		}
		System.out.println("Fcatorial of "+num+ " is :"+fact);
		
		
sc.close();	
	}

}
