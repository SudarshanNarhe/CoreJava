package com.ifelse;

import java.util.Scanner;

public class SingleOrDoubleDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a any Number : ");
		float num = sc.nextFloat();
		if (num<10)
			System.out.println("The number is single digit.");
		else if (num<100)
			System.out.println("The number is a double digit.");
		else 
			System.out.println("The number is a more than double digit.");

sc.close();
	}

}
