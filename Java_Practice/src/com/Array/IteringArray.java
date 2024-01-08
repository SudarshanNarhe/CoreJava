package com.Array;

import java.util.Arrays;

//WAP to copy an array by iterating the array.

public class IteringArray {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6};
		
		
		for(int a : arr)
		{
			System.out.print(a+" ");
		}
		System.out.println("\nCopy : ");
		int temp[]=arr;
		System.out.println(Arrays.toString(temp));
		
	}

}
