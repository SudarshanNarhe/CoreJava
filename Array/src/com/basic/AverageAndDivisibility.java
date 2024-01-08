package com.basic;

import java.util.Scanner;

public class AverageAndDivisibility {

	public static void show(int num[])
	{	
		System.out.println("The array elements are : ");
		for(int s : num)
			System.out.println(s);
	}
	public static int[]arrayCreation()
	{
		int num[];
		System.out.println("Enter a size of array : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		num= new int[size];
		for(int i=0;i<num.length;i++)
		{
			System.out.println("Enter "+(i+1)+" element : ");
			num[i]=sc.nextInt();
		}
		sc.close();
		return num;
	}
	public static void checkAverage(int num[])
	{
		int sum=0;
		int avg=1;
		for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
		}
		System.out.println("The total sum is : "+sum);
		avg=sum/num.length;
		System.out.println("The Average of is : "+avg);
	}

	public static void checkDivisibility(int num[])
	{	
		System.out.print("The number which is divisible by 2 and 3 are : ");
		for(int i=0;i<num.length;i++)
		{
			if((num[i]%2==0)&&(num[i]%3==0))
				System.out.print(num[i]+" ,");
		}
	}
	
	public static void main(String[] args) {
		
		int n[]= arrayCreation();
		show(n);
		checkAverage(n);
		checkDivisibility(n);

	}

}
