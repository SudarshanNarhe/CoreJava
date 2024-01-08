package com._2D_Array;

import java.util.Scanner;

//WAP to find sum of each row and column of a matrix.


public class SumOfRows_Col_Dia {

	public static int [][] useScanner()
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
		/*
		 * sumOfColoumn(arr); ------>> This is the second way to call directly from method 
		    sumOfRows(arr);  ------->> for that we doesn't require a return any value..
		    
		 */
		
		sc.close();
				return arr;
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
	public static void sumOfRows(int num[][])
	{	
			 
		       for(int i=0;i<num.length;i++)
		       {
		    	   int sum=0;
		    	   for(int j=0;j<num.length;j++)
		    	   {
		    		   sum=sum+num[i][j];
		    	   }
		    	   System.out.println("The addition of "+(i+1)+" row is : "+sum);
		       }
		
	}
	public static void sumOfColoumn(int num[][])
	{
		for(int i=0;i<num.length;i++)
		{		
			int sum=0;
			for(int j=0;j<num.length;j++)
			{
				sum=sum+num[j][i];
			}
			System.out.println("The addition of "+(i+1)+" columns is : "+sum);
		}
		
	}
	public static void sumOfDiagonal(int num[][])
	{
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
		
			for(int j=0;j<num.length;j++)
			{	
				if(num[i]==num[j])
				{
					sum=sum+num[i][j];
					
				}
			}
		}
		System.out.println("The sum of Diagonal is : "+sum);
	}
	public static void main(String[] args) {
		
//		int arr[][];
//		
//		arr=useScanner();
//		print(arr);
//		System.out.println("________________________________");
//		sumOfRows(arr);
//		System.out.println("_________________________________");
//		sumOfColoumn(arr);
//		System.out.println("__________________________________");
		
		int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		sumOfDiagonal(arr1);
	}

}
