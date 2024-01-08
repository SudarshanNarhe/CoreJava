package com.switchcase;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number :");
		int num1 = sc.nextInt();
		System.out.println("Enter a second number :");
		int num2 = sc.nextInt();
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplicaton");
		System.out.println("4.Division");
		System.out.println("Enter your choice from above menu : ");
		int choice =sc.nextInt();
		switch (choice)
		{
		case 1 : System.out.println("The Addition is : "+(num1+num2));
		break;
		case 2 : System.out.println("The Substraction is : "+(num1-num2));
		break;
		case 3 : System.out.println("The Multiplication is : "+(num1*num2));
		break;
		case 4 : System.out.println("The Division is : "+(num1/num2));
		break;
		default : System.out.println("Please enter a right choice... ");
		}
		sc.close();	

	}

}
