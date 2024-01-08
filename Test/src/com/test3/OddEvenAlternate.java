package com.test3;

import java.util.Arrays;

/*Take an array of integers as input. Print the odd number and even number alternate. Remaining numbers  [2M]

should appear at the last. 
Ex: I/P=[1,5,9,7,3,6,8,13,2,4] 
O/P=[6,1,8,5,2,9,4,7,3,13]  */

public class OddEvenAlternate {

	public static void printAlternate(int num1[],int num2[])
	{
		int a=num1.length;
		int b= num2.length;
		int count=0;
		int arr[]= new int [a+b];
		if(a>b)
		{
			for(int i=0;i<num1.length;i++)
			{
				if(i<num1.length)
					arr[count++]=num1[i];
				if(i<num2.length)
					arr[count++]=num2[i];
			}
			System.out.println("Merge Adjacent Array : "+Arrays.toString(arr));
		}
		if(a<b)
		{
			for(int i=0;i<num2.length;i++)
			{
				if(i<num1.length)
					arr[count++]=num1[i];
				if(i<num2.length)
					arr[count++]=num2[i];
			}
			System.out.println("Merge Adjacent Array : "+Arrays.toString(arr));
		}
	}
	
	public static void main(String[] args) {

		int arr[]= {1,5,9,7,3,6,8,13,2,4};
		
		int count =0;
		int count1=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				count++;
			
			}
			else
				count1++;
		}
		
		System.out.println("Even Count : "+count);
		System.out.println("Odd Count : "+count1);
		
		int arrE[]=new int [count];
		int arrO[] = new int [count1];
		
		int e=0;
		for(int i=0;i<arr.length;i++)
		{
				if(arr[i]%2==0)
				{
					arrE[e]=arr[i];
					e++;				
				}	
		}
		System.out.println("Even Array : "+Arrays.toString(arrE));
		
		int o=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]%2!=0)
				{
					arrO[o++]=arr[i];
				}
			}
		System.out.println("Odd Array : "+Arrays.toString(arrO));
		
		printAlternate(arrE, arrO);
	}

}
