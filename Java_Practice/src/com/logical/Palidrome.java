package com.logical;

import java.util.Scanner;

public class Palidrome {

	public static void checkPalidrom(int num)
	{
		int original = num;
		int rem;
		int rev=0;
		do
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}while(num>0);
		
		System.out.println("Original number : "+original);
		System.out.println("Reverse Number : "+rev);
		
		if(original==rev)
			System.out.println("Its a Palidrome Number.");
		else
			System.out.println("Its not a Palidrome Number.");
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter any Number : ");
		int num=sc.nextInt();
		checkPalidrom(num);
	sc.close();	
	}

}
