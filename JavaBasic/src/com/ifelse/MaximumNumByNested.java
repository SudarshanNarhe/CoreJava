package com.ifelse;

import java.util.Scanner;

public class MaximumNumByNested {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a 1st number");
		double num1=sc.nextDouble();
		System.out.println("Enter a 2nd number");
		double num2=sc.nextDouble();
		System.out.println("Enter a 3rd number");
		double num3=sc.nextDouble();
		if (num1>num2)
		 {
			if (num1>num3)
			{
				System.out.println(num1+ " is a maximum number between three numbers.");
			}
			else 
			{
				System.out.println(num3+ " is maximum number");
			}
		 }
		else if (num2>num3)
			{
			     if (num2>num1)
				{
					System.out.println(num2+ " is a maximum number between three numbers.");
				}
			} 
	    else //if (num3>num2)
		
			//if (num3>num1)
		   System.out.println(num3+ " is a maximum number between three numbers.");
		
			
		 
	sc.close();
       }

	}


