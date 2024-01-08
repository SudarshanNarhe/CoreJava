package com.test1;

import java.util.Scanner;

public class SumOfPower {

	public int count (int num)
	{
		int count=0;
		do
		{
			count++;
			num=num/10;
		}while(num!=0);
		
		return count;
	}
	public int power(int base, int expo)
	{
		int power=1;
		for(int i=1;i<=expo;i++)
			power=power*base;
		
		return power;
	}
	public void sum(int num1)
	{
		int sum=0;
		int rem;
		int count=count(num1);
		do
		{
			rem=num1%10;
			int power=power(rem,count);
			sum=sum+power;
			num1=num1/10;
			count--;
		}while(num1!=0);
		System.out.println("Sum is : "+sum);
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num=sc.nextInt();
		SumOfPower obj=new SumOfPower();
		obj.sum(num);

	sc.close();
	}

}
