package com.Logics;

import java.util.Scanner;

public class ThreeDigitArmstrong {
 
	public boolean checkArmstrong(int num)
	{
		int sum=0;
		int original=num;
		while (num>0)
		{
			int digit=num%10;
			int cube=digit*digit*digit;
			sum=sum+cube;
			num/=10;
		}
		if (original==sum)
			return true;
		else 
			return false;
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any 3 digit Number : ");
		int num=sc.nextInt();
		
		ThreeDigitArmstrong arm=new ThreeDigitArmstrong();
		boolean armstrong = arm.checkArmstrong(num);
		if (armstrong)
		{
			System.out.println("Its a Armstrong.");
		}
		else 
			System.out.println("Its not a Armstrong.");
		
sc.close();		
	}
	
}
