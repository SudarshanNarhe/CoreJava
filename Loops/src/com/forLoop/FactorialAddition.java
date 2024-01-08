package com.forLoop;

import java.util.Scanner;

public class FactorialAddition {

	public static void main(String[] args) {
		//⦁	s=1!+2!+3!.........+n! find s
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		int fact=1;
		int sum=0;
		for (int i=1;i<=num;i++)
		{
			fact=fact*i;
		
			sum=sum+fact;
		}
		System.out.println("The Sum of factorial from 1 to "+num+" is :"+sum);
sc.close();
	}

}
