package com.Logics2;

import java.util.Scanner;

public class SumOf1stAndLastDigit {

	static int sumOf1stAndLast(int n)
	{
		int lastdigit=n%10;
		int rev=1;
		int rem;
		int sum=0;
		do {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		} while (n != 0);
		int firstdigit = rev % 10;
		sum = lastdigit + firstdigit;
		return sum;
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter any number : ");
		int num=sc.nextInt();
		
		int sum=sumOf1stAndLast(num);
		
		System.out.println("The Sum of 1st and last digit of "+num+" is : "+sum);
		
sc.close();
	}

}
