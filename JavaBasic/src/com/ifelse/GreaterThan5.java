package com.ifelse;

import java.util.Scanner;

public class GreaterThan5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a any number : ");
		int num= sc.nextInt();
		if(num>5)
		{
			System.out.println("The number is greater than 5.");
		}
		else if (num==5)
			System.out.println("The number is equal to the 5.");
		else 
			System.out.println("The number is not greater than 5.");
		
sc.close();
	}

}
