package com.basic;

import java.util.Arrays;

import java.util.Scanner;

public class OddEven {

	public static void show(int num[])
	{
		System.out.println("The array elements are : ");
		for(int k : num)
			System.out.println(k);
	}
	public static int [] arrayCreation()
	{	
		int num[];
		System.out.println("Enter size of number : ");
		Scanner sc= new Scanner (System.in);
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
	public static void printEvenArray(int num[])
	{
		int count=0;
		
		for(int i=0;i<num.length;i++)
		{	
			if(num[i]%2==0)
			{
				count++;
			}
		}
		int  arr[]= new int [count];
		int j=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
			{
				arr[j]=num[i];
				j++;
			}
		}
		System.out.println("Array of Even Numbers : "+Arrays.toString(arr));
		
		
		
	}
	public static void checkEven(int num[])
	{
		System.out.println("The Even numbers are : ");
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
				System.out.println(num[i]);
		}
		
	}
	public static void printOddArray(int num[])
	{
		int count=0;
		
		for(int i=0;i<num.length;i++)
		{	
			if(num[i]%2!=0)
			{
				count++;
			}
		}
		int  arr[]= new int [count];
		int j=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2!=0)
			{
				arr[j]=num[i];
				j++;
			}
		}
		System.out.println("Array of Odd Number is : "+Arrays.toString(arr));
		
	}
	public static void checkOdd(int num[])
	{
		System.out.println("The odd numbers are : ");
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2!=0)
				System.out.println(num[i]);
		}
		
	}
	
	public static void main(String[] args) {
		
		//int n[]=arrayCreation();
		int n1[]= {1,2,3,4,5,6,7,8,9,10};
		show(n1);
		checkEven(n1);
		checkOdd(n1);
		printEvenArray(n1);
		printOddArray(n1);

	}

}
