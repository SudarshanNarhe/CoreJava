package com.ifelse;
import java.util.Scanner;
public class NestedIfDemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your percentage");
		float per= sc.nextFloat();
		if (per>=60)
		{
			if (per>=80)
			{
				System.out.println("You can eligible for both science and commerce");
			}
			else
			{
				System.out.println("You are eligible for commerce");
			}
		}
		else 
		{
			System.out.println("You are not eligible for college");
		}
		sc.close();
		

	}

}
