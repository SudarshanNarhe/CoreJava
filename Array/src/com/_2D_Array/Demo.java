package com._2D_Array;

import java.util.Scanner;

public class Demo {

	public static void arrayCraetion()
	{
		int arr[][]= new int [3][3];
		
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6;
		
		arr[2][0]=7;
		arr[2][1]=8;
		arr[2][2]=9;
		
		print(arr);
		
	}
	public static void print(int p[][])
	{
		for(int i=0;i<p.length;i++)
		{
			for(int j=0;j<p[i].length;j++)
			{
				System.out.print(p[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void useScanner()
	{
		int arr[][];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of rows : ");
		int  rows = sc.nextInt();
		arr=new int [rows][];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter a size of "+(i+1)+" column : ");
			int col= sc.nextInt();
			arr[i]= new int[col];
			
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter a the Element : ");
				int ele= sc.nextInt();
				arr[i][j]=ele;
			}
		}
		sc.close();
		print(arr);
	}
	public static void useFirstClass()
	{
		int arr[][]= {{10,20,30},{12,14,16,18},{5,4,3,2},{0,1}};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void jaggedArray()
	{
		int arr[][]=new int [3][];
		arr[0]=new int [3];
		arr[1]=new int [4];
		arr[2]=new int [2];
		
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=count++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The count is : "+count);
		
	}
	public static void copyArray()
	{
		char[]copy = {'a','b','c','d','e','i','n','h','s','t','b','p','w'};
		
		char []copyTo = new char[7];
		
		System.arraycopy(copy, 4, copyTo, 0, 7);
		System.out.println(String.copyValueOf(copyTo));
	}
	public static void useEnhance()
	{
		int arr[][]= new int [3][3];
		
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6;
		
		arr[2][0]=7;
		arr[2][1]=8;
		arr[2][2]=9;
		
		for(int[] err : arr)
		{
			for(int err1 : err)
			{
				System.out.print(err1+" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		
		arrayCraetion();
		//useScanner();
		System.out.println("________________________________");
		useFirstClass();
		System.out.println("________________________________");
		jaggedArray();
		System.out.println("_________________________________");
		copyArray();
		System.out.println("_________________________________");
		useEnhance();
	}

}
