package com.test3;

//Create a Array of integer and count the number of even and odd elements from array.[1M]


public class CheckOdd_Even {

	public static void checkEvenOdd(int num[])
	{	
		int count =0;
		int count1=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
			{
				count++;
			}
			else
				count1++;
		}
		System.out.println("The Even numbers in Given array is : "+count);
		System.out.println("The Odd numbers in Given array is : "+count1);
		
		
	}
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9};
		checkEvenOdd(arr);

	}

}
