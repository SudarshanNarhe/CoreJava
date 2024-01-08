package com._2D_Array;

import java.util.Scanner;

public class AdditionOfMatrices {

	public static void arrayCreation(int p[][])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a size of rows : ");
		int size = sc.nextInt();
		p=new int [size][];
		for(int i=0;i<p.length;i++)
		{
			System.out.println("Enter a Size of colounm : ");
			int col = sc.nextInt();
			p[i]=new int [col];
			for(int j=0;j<p[i].length;j++)
			{
				System.out.println("Enter a Element : ");
				int ele = sc.nextInt();
				p[i][j]=ele;
			}
		}
		sc.close();
	}
	public static void print(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void addition()
	{
		int a[][]= {{1,2,3},{4,2,8}};
		int b[][]= {{2,3,1},{4,2,7}};
		
		int c[][]= new int [2][3];
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void subtraction()
	{
		int a[][]= {{10,20,30},{40,20,80}};
		int b[][]= {{20,30,10},{40,20,70}};
		
		int c[][]= new int [2][3];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]-b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void multiplication()
	{
		int a[][]= {{1,1,1},{2,2,2},{3,3,3}};
		int b[][]= {{1,1,1},{2,2,2},{3,3,3}};
		
		int c[][]= new int [3][3];
		for(int i=0;i<3;i++)
		{		
			for(int j=0;j<3;j++)
			{
				c[i][j]=0;
				for(int k=0;k<3;k++)
				{
				c[i][j]+=a[i][k]*b[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		addition();
		System.out.println("________________________________");
		multiplication();
		System.out.println("_________________________________");
		subtraction();
	}

}
