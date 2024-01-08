package com.basic;

import java.util.Scanner;

/*WAP to print all negative elements in an array and also count total number of 
 * negative elements in an array.
 */

/*WAP to find the second smallest element in an array.*/


public class CountNegativeNumbers {
	
	public static void show(int num[])
	{
		System.out.print("The elements are : ");
		for(int e : num)
		{
			System.out.print(e+" ");
		}
	}
	public static int [] arrayCreation()
	{
		int num[];
		System.out.println("Enter a size of a array : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		num = new int [size];
		for(int i=0;i<num.length;i++)
		{
			System.out.println("Enter "+(i+1)+" numbers : ");
			num[i]=sc.nextInt();
		}
		sc.close();
		return num;
	}
	public static void checkNegative(int num[])
	{	
		System.out.print("\nThe Negative numbers are : ");
		int count=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<0)
			{
				System.out.print(num[i]+" ");
				count++;
			}
		}
		System.out.println("\nThe count of negative numbers is : "+count);
	}
	public static void checkMax(int num[])
	{
		int max=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>max)
				max=num[i];
		}
		System.out.println("\nThe maximum number from given data is : "+max);
	}
	public static void checkMin(int num[])
	{
		int min=num[0];  // Assume first element is minimum in array;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<min)
				min=num[i];
		}
		System.out.println("\nThe minimum number from given data is : "+min);
	}
	
	public static void main(String[] args) {
		
		//int n[]= arrayCreation();
		int arr[]= {5,6,7,11,4,2,8,12,10};
		show(arr);
		checkNegative(arr);
		checkMax(arr);
		checkMin(arr);
		
	}

}
