package com.basic;

import java.util.Arrays;

/*WAP to reverse the array itself, don’t print array in reverse – I want current array reverse. 
Means e.g. arr[] = [3, 90, 45, 29, 37, 78] so your same array must be [78, 37, 29, 45, 90, 3] 
		without using temporary array.*/


public class ReverseArray {

	public static void usingTemp(int num[])
	{
		int temp;
		int start=0;
		int end=num.length-1;
		
		while(end>start)
		{
			temp=num[start];
			num[start]=num[end];
			num[end]=temp;
			
			start++;
			end--;
		}
		System.out.println("Reverse Array is : "+Arrays.toString(num));
	}
	public static void withoutTemp(int num[])
	{
		int a=0;
		int b=num.length-1;
		
		while(b>a)
		{
			num[a]=num[a]+num[b];
			num[b]=num[a]-num[b];
			num[a]=num[a]-num[b];
			
			a++;
			b--;
		}
		System.out.println("Reverse Array is : "+Arrays.toString(num));
	}
	public static void main(String[] args) {
	
		int a[]= {12,45,32,67,89};
		System.out.println("Original Array is : "+Arrays.toString(a));
		//usingTemp(a);
		withoutTemp(a);
		
	}

}
