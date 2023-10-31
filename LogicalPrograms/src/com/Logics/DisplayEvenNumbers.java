package com.Logics;

import java.util.Scanner;

public class DisplayEvenNumbers {

	static void evenNumbers(int num)
	{
		
		while (num>0)
		{
			int digit=num%10;
			num=num/10;	
		
		if(digit%2==0)
		{
			System.out.println(digit);
		}
	}
		
}
		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		evenNumbers(num);
		//evenNumbers(12345);    for these comment out scanner and input section.
		
sc.close();
	}

}
