package com.basic;

import java.util.Scanner;

public class RevesrseOrder {

	public static void show(int num[])
	{
		System.out.println("Array Elements are : ");
		for(int e : num)
		{
			System.out.println(e);
		}
	}
	public static int [] arrayCreation()
	{
		int num[];
		System.out.println("Enter a size of array : ");
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		num= new int [size];
		
		for(int i=0;i<num.length;i++)
		{
			System.out.println("Enter "+(i+1)+ " element : ");
			num[i]=sc.nextInt();
		}
		sc.close();
		return num;
	}
	public static void reverse(int num[])
	{
		System.out.println("The revesre array elements are : ");
		for(int i=num.length-1;i>=0;i--)
		{
			System.out.println(num[i]);
		}
	}
	
	public static void main(String[] args) {
		
//		int n[]= arrayCreation();
//		reverse(n);
//		show(n);
		
		int a[]= {12,32,34,55};
		reverse(a);
		show(a);
	

	}

}
