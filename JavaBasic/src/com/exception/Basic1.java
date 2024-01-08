package com.exception;

public class Basic1 {

	public static void sum(int num[])
	{	
		int sum=0;
		for(int i=0;i<=num.length;i++)
		{
			sum=sum+num[i];
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Before...");
		int num[]= {1,2,3,4,5};
		
		
		
		try {
			sum(num);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace();                
		}
		System.out.println("After......");

	}

}
