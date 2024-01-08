package com.ifelse;

import java.util.Scanner;

public class ComparismOfNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first number :");
		int num1=sc.nextInt();
		System.out.println("Enter a second number :");
		int num2=sc.nextInt();
		if(num1>num2)
		{
			System.out.println("The greater number is : "+num1);
		}
		else if(num2>num1)
			System.out.println("The greater number is : "+num2);
		else 
			System.out.println("Both numbers are equal.");
sc.close();
	}

}
