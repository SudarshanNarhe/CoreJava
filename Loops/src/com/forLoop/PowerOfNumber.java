package com.forLoop;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number :");
		int num = sc.nextInt();
		System.out.println("Enter a power you have to find : ");
		int raised =sc.nextInt();
		long power=1;
		for (int i=1; i<=raised;i++)
		{
			power=power*num;
		}
		System.out.println("The power of "+num+" is : "+power);
		
sc.close();
	}

}
