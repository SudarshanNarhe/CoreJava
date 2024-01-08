package com.whileLoop;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int num= 1;
		int sum = 0;
		while(num!=0)
		{
			System.out.println("Enter a any Number : ");
			num =sc.nextInt();
			sum+=num;
		}
		System.out.println("The sum is : "+sum);
		
sc.close();
	}

}
