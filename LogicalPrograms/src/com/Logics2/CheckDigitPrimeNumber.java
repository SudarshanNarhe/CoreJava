package com.Logics2;

import java.util.Scanner;

public class CheckDigitPrimeNumber {

	static void checkPrimeDigits(int n)
	{
		boolean status;
		do 
		{
			int rem=n%10;
			status=true; //assume the rem is prime for check a prime or not.
			if((rem==0)||(rem==1))
				status=false;
			else
			{
				for(int i=2;i<rem;i++)
				{
					if(rem%i==0)
					{
						status= false;
						break;
					}
				}
			}
			if(status) //if (true)    else(false)
			{
				System.out.println(rem);
			}
			n=n/10;

		}while(n!=0);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num=sc.nextInt();
		checkPrimeDigits(num);
		
sc.close();
	}

}
