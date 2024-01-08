package com.basic;

import java.util.Arrays;

import java.util.Scanner;

/*WAP to insert an element in a specific position into an array.*/


public class SpecificPosition {

	public static void show(int num[])
	{
		System.out.println("The numbers are : ");
		for(int sk : num)
			System.out.println(sk);
	}
	public static void position(int arr[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a position of element : ");
		int index = sc.nextInt();
		System.out.println("Enter a number for replace : ");
		int num= sc.nextInt();
		
		/*
		 * as we take a 
		 * int arr[]= new int [];
		 * arr[0]=10;
		 * arr[1]=20;
		 * arr[2]=30;
		 * such as we are taking size and number from user that's why we take
		 * we change the position by changing the position-1 bcz it starts from 0;
		 * 
		 *  arr[index-1]= num;
		 *  
		 */
		
		arr[index-1]=num;  
		System.out.println(Arrays.toString(arr));
		
	sc.close();
	}
	public static void position2(int num[])
	{
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter a position of element : ");
		int ele=ss.nextInt();
		System.out.println("Enter a number for replace : ");
		int number= ss.nextInt();
		
		int newArrayLength = num.length+1;
		int []newArray= new int [newArrayLength];
		
		//step -- 1
		for(int i=0;i<ele-1;i++)   // ----->> we can use ele-1 here so we have to just change
								// ------>> all the ele by ele-1;
		{
			newArray[i]=num[i];
		}
		
		//step -- 2
		newArray[ele-1]=number;
		
		//step --3
		for(int i=ele-1; i<num.length;i++)
		{
			newArray[i+1]=num[i];
		}
		System.out.println(Arrays.toString(newArray));
		ss.close();
		
	}
	
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40};
		System.out.println(Arrays.toString(arr));
		position(arr);
		//position2(arr);
		
	}

}
