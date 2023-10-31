package com.Logics;

import java.util.Scanner;

public class Palindrome_2 {
	
	public void findReverse(int num)
	{
		int rev =0;
		while (num>0)
		{
			int digit =num%10;
			rev = rev*10+digit;
			num/=10;
		}
		System.out.println(rev);
	}
	public boolean checkPalindrome(int num)
	{
		int rev=0;
		int original=num;
		while(num>0)
		{
			int digit =num%10;
			rev =rev*10+digit;
			num/=10;
		}
		System.out.println(rev);
		if (original==rev)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a any number : ");
		int num=sc.nextInt();
		
		Palindrome_2 palin=new Palindrome_2();
		//palin.findReverse(num);
		boolean isPalindrome=palin.checkPalindrome(num);
		if (isPalindrome)
		{
			System.out.println("Number is Palindrome");
		}
		else 
		{
			System.out.println("Not Palindrome");
		}
sc.close();
	}
}
