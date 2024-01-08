package com.basic;

import java.util.Scanner;

public class LessThanAvg {

	public static void show(int num[])
	{
		System.out.println("The array of Elements are : ");
		for(int s : num)
			System.out.println(s);
	}
	public static int []arrayCreation()
	{
		int num[];
		System.out.println("Enter a size of array : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		num = new int [size];
		
		for(int i=0;i<num.length;i++)
		{
			System.out.println("Enter "+(i+1)+" number : ");
			num[i]=sc.nextInt();
		}
		sc.close();
		return num;
		
	}
	public static void checkLessThanAvg(int num[])
	{	
		int avg=1;
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
		}
		avg=sum/num.length;
		System.out.println("The average is : "+avg);
		System.out.println("The number which are less than its Average is : ");
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<avg)
			{
				System.out.println(num[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		
		int n[]=arrayCreation();
		show(n);
		checkLessThanAvg(n);
		
	}

}
