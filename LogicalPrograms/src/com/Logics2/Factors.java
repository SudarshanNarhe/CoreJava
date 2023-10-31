package com.Logics2;

import java.util.Scanner;

public class Factors {

	static void checkFactors(int n)
	{
		if(n==1)
			System.out.println(n);
		else 
		{
			for(int i=1;i<=n/2;i++)
			{
				if(n%i==0)
				{
					System.out.println(i);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		System.out.println("The factors are : ");
		checkFactors(num);
		
	sc.close();	
	}
}
