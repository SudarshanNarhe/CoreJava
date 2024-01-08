package com.ternary;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		
		System.out.println((num%2==0)?"The number is Even ": "The number is Odd");
sc.close();
	}

}
