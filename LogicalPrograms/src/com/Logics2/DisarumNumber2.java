package com.Logics2;

import java.util.Scanner;

public class DisarumNumber2 {

	static int count(int n)
	{
		int count =0;
		while(n>0)
		{
			count++;
			n/=10;
		}
		return count;
	}
	
	static int power(int digit, int count)
	{
		int power=1;
		for (int i=1;i<=count;i++)
		{
			power=power*digit;
		}
		return power;
	}
	
	static boolean checkDisarum(int n)
	{
		int sum=0;
		int count=count(n);
		int original=n;
		while(n>0)
		{
			int digit=n%10;
			int power=power(digit, count);
			sum+=power;
			count--;
			n/=10;
		}
		if(sum==original)
		{
			return true;
		}
		else
			return false;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int num=sc.nextInt();
		boolean dis=checkDisarum(num);
		
		if(dis)
		{
			System.out.println("The number is a Disarum number.");
		}
		else
			System.out.println("The number is NOT a disarum number.");
		

sc.close();
	}

}
