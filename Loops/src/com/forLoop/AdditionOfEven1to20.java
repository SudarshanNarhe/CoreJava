package com.forLoop;

public class AdditionOfEven1to20 {

	public static void main(String[] args) {
		int sum=0;
		for (int i=1;i<=20;i++)
		{
			if (i%2==0)
			{
				sum+=i;
			}
			//System.out.println("The Addition of even numbers from 1 to 20 is : "+sum);
		}
		System.out.println("The Addition of even numbrs from 1 to 20 is : "+sum);
	}
}
