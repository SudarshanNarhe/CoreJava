package com.basic;

import java.util.Scanner;

public class NamePrinting {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name=sc.next();
		System.out.println("Enter your Friend name :");
		String name1=sc.next();
		System.out.println("Hi!! "+name1+ " I am "+name+", How are you?");
		
sc.close();
	}

}
