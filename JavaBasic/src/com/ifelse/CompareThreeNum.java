package com.ifelse;

import java.util.Scanner;

public class CompareThreeNum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a first number :");
		int num1=sc.nextInt();
		System.out.println("Enter a second number : ");
		int num2=sc.nextInt();
		System.out.println("Enter a third number : ");
		int num3=sc.nextInt();
		if(num1>num2)
		{
			if(num1>num3)
				System.out.println("The "+num1+" is a greater number.");
			else 
				System.out.println("The "+num3+ " is a greater number.");
		}
		else if(num2>num1)
		{
			if (num2>num3)
				System.out.println("The "+num2+ " is a greater number. ");
			else 
			System.out.println("The "+num3+ " is the greater number. ");
		}
		//else 
		//	System.out.println("The "+num3+ " is a greater number. ");
		sc.close();
	}

}
