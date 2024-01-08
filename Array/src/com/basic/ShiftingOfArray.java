package com.basic;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftingOfArray {

	public void leftShifting(int num[])
	{	
		System.out.println("The Original array is : ");
		for(int arr : num)
			System.out.print(arr+"  ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter a how many elements you have to shift to left : ");
		int n= sc.nextInt();
		
		
		for(int i=0;i<n;i++)
		{	
			int temp=num[0];
			for(int j=0;j<num.length-1;j++)
			{	
				num[j]=num[j+1];
			}
			num[num.length-1]=temp;
		}
		System.out.println("The shifted Array is : ");
		for(int arr : num)
		{
			System.out.print(arr+" ");
		}
		sc.close();
	}
	public void rightShifted(int num[])
	{	
		System.out.println("The original Array is : ");
		for(int arr : num)
		{
			System.out.print(arr+" ");
		}
		Scanner sc= new Scanner (System.in);
		System.out.println("\nEnter a how many elements you have to shift to right side : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int temp=num[num.length-1];
			for(int j=num.length-1;j>0;j--)
			{
				num[j]=num[j-1];
			}
			num[0]=temp;
		}
		System.out.println("The Shifted Array is : ");
		System.out.print(Arrays.toString(num));
		
		
  sc.close();
	}
	
	
	public static void main(String[] args) {
		
		ShiftingOfArray obj = new ShiftingOfArray();
		int arr[]= {2,3,4,5,6,7};
		//obj.leftShifting(arr);
		obj.rightShifted(arr);
		
//		int n=2;
//		for(int i=0;i<n;i++) {
//			
//			int temp=arr[arr.length-1];
//			for(int j=arr.length-1;j>0;j--) {
//				arr[j]=arr[j-1];
//			}
//			arr[0]=temp;
//			
//		}
//		System.out.println(Arrays.toString(arr));
	
	}

}
