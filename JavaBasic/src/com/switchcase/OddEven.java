package com.switchcase;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		switch (num%2)
		{
		case 0 : System.out.println("The number is even");
		break;
		default : System.out.println("The number is odd");
		}
		sc.close();
	}

}
