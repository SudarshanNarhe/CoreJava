package com.Logics;

import java.util.Scanner;

public class ExtractDigits {
	static void extract(int n)
	{
		int rem;
		do {
			rem=n%10;
			System.out.println(rem);
			n/=10;		
		}while(n!=0);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a any number : ");
		int num = sc.nextInt();
		extract(num);
		
sc.close();
	}

}
