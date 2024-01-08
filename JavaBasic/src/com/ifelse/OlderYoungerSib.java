package com.ifelse;

import java.util.Scanner;

public class OlderYoungerSib {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of older siblings");
		int old = sc.nextInt();
		System.out.println("Enter a number of younger siblings");
		int yng=sc.nextInt();
		if((old==0)&&(yng==0))
			System.out.println("You are an only child");
		else if ((old==0)||(yng==1))
			System.out.println("You are the oldest child");
		else if ((old==1)||(yng==0))
			System.out.println("You are the youngest child");
		else 
			System.out.println("You are the middle child");
		
		sc.close();
	}
}
