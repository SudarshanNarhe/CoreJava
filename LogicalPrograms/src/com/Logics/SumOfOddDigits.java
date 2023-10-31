package com.Logics;

import java.util.Scanner;

public class SumOfOddDigits {

	static int sum(int num)
	{
		int add=0;
		while(num>0)
		{
			int digit=num%10;
			num=num/10;
		 
			if (digit%2!=0)
			{
				add=add+digit;
			}
			
		}
		
		return add;
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter a any number : ");
		int num=sc.nextInt();
		sum(num);
		int sum1= sum(num);
		System.out.println("The Sum of Odd Digit is : "+sum1);
		
		
sc.close();
	}

}
