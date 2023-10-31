package com.Logics;

import java.util.Scanner;

public class Armstrong {

	public int count(int num)
	{
		int count =0;
		while (num>0)
		{
			count++;
			num/=10;
		}
		return count;
	}
	public int power(int base, int expo)
	{
		int power=1;
		for (int i=1;i<=expo;i++)
		{
			power=power*base;
		}
		return power; 
	}
	public boolean armstrong(int num)
	{
		int sum=0;
		int original=num;
		//armstrong that is sum of power is equal to that number.
		//we required count, power, sum, checking 
		int count =count(num);
		while (num>0)
		{
			int digit=num%10;
			int power=power(digit,count);
			sum=sum+power;
			num/=10;
		}
		if (sum==original)
		{
			return true;
		}
		else 
			return false;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		
		Armstrong arm=new Armstrong();
		boolean armstrong1= arm.armstrong(num);
		if (armstrong1)
			System.out.println("Its a Armstrong.");
		else 
			System.out.println("Its not a Armstrong.");
		
sc.close();
	}

}
