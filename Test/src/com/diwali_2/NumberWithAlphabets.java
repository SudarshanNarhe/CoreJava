package com.diwali_2;

import java.util.Scanner;

public class NumberWithAlphabets {

	public static char getAlphabets(int num) {
	
		char a='A';
		int num2= (num-1)/1000;
		char b=(char) (a+num2);
		return b;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any Number : ");
		
		int number = sc.nextInt();
		if(number>=1 && number<=26000) {
		char result= getAlphabets(number);
		System.out.println("Result : "+result);
		}
		else
			System.out.println("Please enter Number between 1 to 26000");
		
sc.close();
		
	}

}
