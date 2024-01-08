package com.ifelse;

import java.util.Scanner;

public class Divisibleby5and11 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number :");
		float num = sc.nextFloat();
		if((num%5==0)&&(num%11==0))
		{
			System.out.println("The number is divisible by 5 and 11");
		}
		else
		{
			System.out.println("The number is not divisible by 5 and 11");
		}
		sc.close();

	}

}
