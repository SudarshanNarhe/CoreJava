package com.ifelse;

import java.util.Scanner;

public class MultipleBy5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number : ");
		int num=sc.nextInt();
		if (num%5==0)
			System.out.println("The number "+num+ " is multiple of 5.");
		else 
			System.out.println("The number "+num+ " is not a multiple of 5.");
sc.close();
	}

}
