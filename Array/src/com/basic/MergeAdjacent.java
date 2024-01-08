package com.basic;

import java.util.Arrays;

public class MergeAdjacent {

	public static void mergeAdjacent(int num1[], int num2[])
	{
		int a=num1.length;
		int b= num2.length;
		
		int arr[]=new int [a+b];
		int count =0;
		for(int i=0;i<num1.length;i++)
		{
			arr[count++]=num1[i];
			//count++;
			arr[count++]=num2[i];
			//count++;
		}
		System.out.println("The merge Array is : "+Arrays.toString(arr));
	}
	
	public static void mergeDiff(int num1[],int num2[])
	{
		int a=num1.length;
		int b=num2.length;
		
		int arr[]=new int [a+b];
		int count=0;
		if(a>b)
		{
			for(int i=0;i<num1.length;i++)
			{	
				if(i<num1.length)
				arr[count++]=num1[i];
				if(i<num2.length)
				arr[count++]=num2[i];
	
			}
			System.out.println("The merge Array is : "+Arrays.toString(arr));
			
		}
		else
		{
			for(int i=0;i<num2.length;i++)
			{	
					if(i<num1.length)
					arr[count++]=num1[i];
					if(i<num2.length)
					arr[count++]=num2[i];
			}
			System.out.println("The merge Array is : "+Arrays.toString(arr));
		}
	}
	
	
	public static void main(String[] args) {
		
		int n[]= {10,20,30,90};
		int m[]= {50,60,20,80,12};
		
		//mergeAdjacent(n, m);
		//System.out.println("____________________");
		mergeDiff(n, m);

	}

}
