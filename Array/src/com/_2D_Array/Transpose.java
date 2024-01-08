package com._2D_Array;

public class Transpose {

	public static void transpose(int num[][])
	{
		int original[][]=num;
		int rows= num.length;
		int col=num.length;
		int arr[][]= new int [rows][col];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=num[j][i];
			}
		}
		
		System.out.println("The Original Array is : ");
		for(int i=0;i<original.length;i++) 
		{	
			for(int j=0;j<original.length;j++)
			{
			System.out.print(original[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("The Transpose is : ");
		for(int i=0;i<arr.length;i++) 
		{	
			for(int j=0;j<arr.length;j++)
			{
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		transpose(arr);

	}

}
