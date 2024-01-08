package com.basic;

import java.util.Scanner;

public class ArrayCreation {
	
	public static int [] arrayCreation()
	{
		int num[];
		System.out.println("Enter a size of Array : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		num = new int[size];
		
		for(int i=0;i<num.length;i++)
		{
			System.out.println("Enter "+(i+1)+" Element :");
			num[i]=sc.nextInt();
		}
		sc.close();
		return num;
	}
	public static void display(int num[])
	{
		System.out.println("Array elements are :");
		for(int e: num)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
	
//		int n[]=arrayCreation();
//		display(n);
		
		Object obj[]= new Object[5];
		obj[0]=2.3f;
		obj[1]=4;
		obj[2]=12.32;
		obj[3]='S';
		obj[4]="Sudarshan";
		
		for(Object err : obj)
			System.out.println(err);
		
	}

}
