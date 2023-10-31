package com.Logics;

import java.util.Scanner;

public class Palindrome {
	static boolean checkPalindrome(int n)
	{
		int original=n;
		int rev=0;
		int rem;
		do 
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}while(n!=0);
		if(original==rev)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter any number : ");
		int num=sc.nextInt();
		if(checkPalindrome(num))
		System.out.println("The number is Palindrome");
		else 
			System.out.println("The number is not a Palindrome");
sc.close();
	}

}
