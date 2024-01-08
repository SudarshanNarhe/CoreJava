package com.ifelse;

import java.util.Scanner;

public class MaximumNumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a 1st number");
		double num1=sc.nextDouble();
		System.out.println("Enter a 2nd number");
		double num2=sc.nextDouble();
		System.out.println("Enter a 3rd number");
		double num3=sc.nextDouble();
		if ((num1>num2)&&(num1>num3))
		{
			System.out.println(num1+ " is the maximum number between three numbers");
		}
		 else if ((num2>num1)&&(num2>num3))
		{
			System.out.println(num2+ " is the maximum number between three numbers");
		}
		else 
		{
			System.out.println(num3+ " is the maximun number between three numbers");
		}
		sc.close();

	}

}
