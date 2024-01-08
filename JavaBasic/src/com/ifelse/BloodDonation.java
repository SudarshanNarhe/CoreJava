package com.ifelse;
import java.util.Scanner;
public class BloodDonation {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age :");
		int age= sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("Enter your weight");
			float wt= sc.nextFloat();
			if(wt>=50)
			{
				System.out.println("You can donate a blood");
			}
			else 
			{
				System.out.println("Your weight is less than 50 you cannot donate blood rightnow.");
			}
		}
		else 
		{
			System.out.println("You are not eligible for blood donation.");
		}
		sc.close();

	}

}
