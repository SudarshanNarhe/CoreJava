package com.Logics2;

import java.util.Scanner;

public class SumReachesToOneDigit {

	static int sumOneDigit(int n)
	{
		int sum=0;
		while (n>0||sum>9)
		{
			if(n==0)
			{
				n=sum;
				sum=0;
			}
			sum=sum+(n%10); // sum+=(n%10);
			n/=10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter any number : ");
		int num=sc.nextInt();
		int sum=sumOneDigit(num);
		System.out.println("The answer is : "+sum);
		
sc.close();		
	}
}
