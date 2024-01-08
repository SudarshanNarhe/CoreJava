package com.scannerdemo;

import java.util.Scanner;

public class PercentageMarks {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Name :");
		String name= sc.next();
		System.out.println("Enter mark of Chemistry :");
		float chem= sc.nextFloat();
		System.out.println("Enter mark of physics :");
		float phy= sc.nextFloat();
		System.out.println("Enter mark of biology :");
		float bio= sc.nextFloat();
		System.out.println("Enter mark of English :");
		float eng= sc.nextFloat();
		System.out.println("Enter mark of Math :");
		float math= sc.nextFloat();
		float prntg= (chem+phy+bio+eng+math)/500*100;
		System.out.println(name+ " has scored "+prntg);
		if(prntg>=40) {
			System.out.println("Congratulations You are Pass.");
		}
		else 
		{
			System.out.println("Sorry You are fail.");
		}
		sc.close();

	}

}
