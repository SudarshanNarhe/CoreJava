package com.Logics2;

import java.util.Scanner;

public class PrimeNumbers {
	
	static boolean checkPrime(int n)
	{
		boolean status=true;   //assumption the number is prime 
		if((n==0)||(n==1))
		{
			status=false;
		}
		else 
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					System.out.println(i);
					status=false;
					break;
				}
			}
		}
		return status;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num=sc.nextInt();
		
		if (checkPrime(num))
			System.out.println("Its a prime Number.");
		else 
			System.out.println("Its not a prime Number.");
		
			
sc.close();		
	}

}
