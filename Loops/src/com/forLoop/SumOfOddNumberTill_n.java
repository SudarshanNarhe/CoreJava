package com.forLoop;

import java.util.Scanner;

public class SumOfOddNumberTill_n {

	public static void main(String[] args) {
		// Write a Java program to find sum of all odd numbers between 1 to n.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value of n : ");
		int n =sc.nextInt();
		int sum=0;
		for(int i=1; i<=n;i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;   //sum+=i;
			}
		}
			System.out.println("The sum of Odd numbers from 1 to "+n+" is : "+sum);
		
		
sc.close();
	}

}
