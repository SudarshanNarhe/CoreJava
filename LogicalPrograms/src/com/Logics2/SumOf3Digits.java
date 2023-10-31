package com.Logics2;

import java.util.Scanner;

public class SumOf3Digits {

	static int checkSumOf3Digit(int n)
	{
		int sum=0;
		for (int i=1;i<=3;i++)
		{
			sum+=n%10;
			n/=10;
			
		}
		return sum;
		
	}
	
	static int findRev(int n)
	{
		int rev=0;
		int rem;
		do
		{
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}while(n!=0);
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number more than 3 digit : ");
		int num=sc.nextInt();
		
		int sumOfLast3=checkSumOf3Digit(num);
		System.out.println("The Sum of last 3 digits is : "+sumOfLast3);
		
		int revnum=findRev(num);
		int sumOfFirst3=checkSumOf3Digit(revnum);
		System.out.println("The Sum of first 3 digits is : "+sumOfFirst3);
		
		if(sumOfLast3==sumOfFirst3)
		{
			System.out.println("Correct");
		}
		else 
		{
			System.out.println("Incorrect");
		}
		
sc.close();
	}

}
