package com.basic;

//WAP to merge 2 arrays to 3rd array. 3rd array should not have elements of same value.


import java.util.Arrays;

public class MergeArray {

	public static void merge(int num1[],int num2[])
	{
		int a=num1.length;
		int b=num2.length;
		
		int arr[]= new int[num1.length + num2.length];
	
	/*
	 * we can also use int arr[]= new int [a+b];
	 * 
	 */
		
		// Merging two arrays 
		for(int i=0;i<a;i++)
		{
			arr[i]=num1[i];
		}
		for(int i=0;i<b;i++)
		{	
			arr[a+i]=num2[i];
		}
		System.out.println(Arrays.toString(arr));
		
		// step -- 2 Sorting Acsending 
		
		for (int i=0; i<arr.length-1;i++)
		{
			for(int j=0; j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
				   int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	System.out.println(Arrays.toString(arr));
			
		// Delete repeating number 
			
		int []newArray = new int [arr.length];
		newArray[0]=arr[0];
		int count =1;
		
		for(int j=1;j<arr.length;j++)
		{
			if(arr[j]!=arr[j-1])
			{
				newArray[count]=arr[j];
				count++;
			}
		}
		//System.out.println("The Merge array is : "+Arrays.toString(newArray));
		
		int arr1[]= new int [count];
		for(int k=0;k<arr1.length;k++)
		{
			arr1[k]=newArray[k];
		}
		System.out.println("n The Merge array is :"+Arrays.toString(arr1));
	  }
	
	
	public static void main(String[] args) {
		
		int num1[]= {10,20,30,40};
		int num2[]= {50,60,70,20};
		
		merge(num1, num2);
		
	}

}
