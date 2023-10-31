package com.Logics2;

import java.util.Scanner;

public class TwinPrimeNumbers {

	static boolean checkPrime(int n)
	{     
		
		boolean status=true;
		if((n==0)||(n==1))
		{
			status = false;
		}
		else
		{
		for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
				status=false;
				 break;
				}
			}
		}
		return status;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a first number : ");
		int num1= sc.nextInt();
		System.out.println("Enter a second number : ");
		int num2=sc.nextInt();
		
		if(checkPrime(num1)&&checkPrime(num2))
		{
			if ((num1-num2)==2||((num2-num1)==2))
			{
				System.out.println("The numbers are Twin prime.");
			}
			else 
				System.out.println("The numbers are not Twin prime.");
		}
		else
		{
			System.out.println("The one number is not a Prime number.");
		}

		
sc.close();		
	}

}
