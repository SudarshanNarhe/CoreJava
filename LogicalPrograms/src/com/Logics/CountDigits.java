package com.Logics;

import java.util.Scanner;

public class CountDigits {
	
	static int count(int n)
	{
		int count=0;
		do 
		{
			count++;
			n/=10;
		}while (n!=0);
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		System.out.println("The number of digits is : "+count(num));
		
sc.close();
	}

}
