package com.ifelse;

import java.util.Scanner;

public class TeenagerOrNot {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter age of a person : ");
		int age =sc.nextInt();
		if(age<=18)
			System.out.println("He/She is a Teenager");
		else 
		System.out.println("He/She is not a Teenager");
		
sc.close();
	}

}
