package com.Logics2;

import java.util.Scanner;

public class PerfectNumber {

	static boolean checkPerfect(int n)
	{
		int sum=0;
		if(n==1)
			return sum==1;
		for (int i=1;i<=n/2;i++)
		{
			if (n%i==0)
			{
				sum=sum+i;
			}
		}
		return sum==n;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		if(checkPerfect(num))
		{
			System.out.println("The number is perfect number.");
		}
		else 
			System.out.println("The number is not a perfect number.");
sc.close();
	}

}
