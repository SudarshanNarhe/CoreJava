package com.Logics;

import java.util.Scanner;
public class SumOfDigits {

 static void sum (int n)
{
	int rem;
	int sum=0;
	do
	{
		rem=n%10;
		n/=10;
		sum=sum+rem;
	}while(n!=0);
	System.out.println("The sum of digits is : "+sum);
	//return sum;
}


	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter any number : ");
		int num=sc.nextInt();
		sum(num);
		
sc.close();
	}

}
