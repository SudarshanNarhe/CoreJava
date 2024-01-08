package com.JulyEclipse;

import java.util.Arrays;

/*Q1. There is array of numbers less than 10. 
 * Write a program to create maximum number by combining these numbers.
Eg.[5,2,8,9,6,8] is array. Then output number should be  
988652 (It should be formed strictly as number type. Do not generate number from String).*/

public class Que1 {
	
	public static void main(String[] args) {
		
		int []arr= {5,2,8,9,6,8};
		long num=0;
		int temp=arr[0];
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
				
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			
			num=num*10+arr[i];
		}
		System.out.println(num);
		
	}
	
}
