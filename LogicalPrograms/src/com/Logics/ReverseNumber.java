package com.Logics;

import java.util.Scanner;

public class ReverseNumber {
	static int findRev(int n)
	{
		//System.out.println("n before : "+n);
		int rev=0;
		int rem;
		do 
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n/=10;
		}while (n!=0);
		//System.out.println("n after : "+n);
		return rev;
	}
	public static void main(String[] args) {
	   Scanner sc=new Scanner (System.in);
	   System.out.println("Enter a any number : ");
	   int num = sc.nextInt();
	   System.out.println("Reverse number is : "+findRev(num));
	  // System.out.println("Original number is : "+num);
	   
sc.close();
	}

}
