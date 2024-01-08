package com.Array;

import java.util.Arrays;

public class SortingOf_Array {

	public static void main(String[] args) {
		
		int arr[]= {2,4,6,8,9,1,5,3,7};
		
		System.out.println("The Original Array is : ");
		System.out.print(Arrays.toString(arr)+" \n");
		
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{	
			
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("The Sorted Array is : ");
		System.out.println(Arrays.toString(arr)+" ");

	}

}
