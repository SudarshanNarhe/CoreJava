package com.switchcase;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number :");
		int num1=sc.nextInt();
		System.out.println("Enter a second number :");
		int num2=sc.nextInt();
		int value=num1/num2;
		switch(value)
		{
		case 0 : System.out.println("The greater number is : "+num2);
		break;
		default : System.out.println("The greater number is : "+num1);
		}
		
	sc.close();
	}

}
