package com.test1;

import java.util.Scanner;

public class PrimeNumber {

	public static boolean  checkPrime(int num)
	{
		boolean status=true;   //assumption the number is prime 
		if((num==0)||(num==1))
		{
			status=false;
		}
		else 
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					status=false;
					break;
				}
			}
		}
		return status;
		
		
	}
		
		
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter first number : ");
		int n=sc.nextInt();
		System.out.println("Enter second number : ");
		int n1=sc.nextInt();
		
		System.out.println("The prime numbers between "+n+" to "+n1+" is : ");
		
		for(int i=n;i<=n1;i++)
		{
			if(checkPrime(i))
			{
				System.out.println(i);
			}
		}
		
		
	sc.close();	
	}

}
