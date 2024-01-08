package com.ifelse;

import java.util.Scanner;

public class VowelsOrConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any letter :");
		char ch = sc.next().charAt(0);
		if ((ch=='a')||(ch=='A'))
		{
			System.out.println("The letter is vowels");
		}
		else if ((ch=='e')||(ch=='E'))
		{
			System.out.println("The letter is vowels");
		}
		else  if ((ch=='i')||(ch=='I'))
		{
			System.out.println("The letter is vowels");
		}
		else  if ((ch=='o')||(ch=='O'))
		{
			System.out.println("The letter is vowels");
		}
		else  if ((ch=='u')||(ch=='U'))
		{
			System.out.println("The letter is vowels");
		}
//		if (ch=='A')
//		{
//			System.out.println("The letter is vowels");
//		}
//		else if (ch=='E')
//		{
//			System.out.println("The letter is vowels");
//		}
//		else  if (ch=='I')
//		{
//			System.out.println("The letter is vowels");
//		}
//		else  if (ch=='O')
//		{
//			System.out.println("The letter is vowels");
//		}
//		else  if (ch=='U')
//		{
//			System.out.println("The letter is vowels");
//		}	
		else 
		{
			System.out.println("The letter is Consonant");
		}
		sc.close();

	}

}
