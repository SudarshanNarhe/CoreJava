package com.ifelse;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter three numbers");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int num3= sc.nextInt();
		if (num1>num2)
		{
			if (num1>num3)
				System.out.println("The greater number is : "+num1); 
			else 
				System.out.println("The greater number is : "+num3);
		}
		else 
		{
			if (num2>num3)
				System.out.println("The greater number is : "+num2);
			else 
				System.out.println("The greater number is : "+num3);
		}
		
		//// 2nd way 
		if ((num1>num2)&&(num1>num3))
	
			System.out.println("The greatest number is : "+num1);
			else if (num2>num3)
				System.out.println("The greater number is : "+num2);
			else 
				System.out.println("The greater number is : "+num3);
			
		
		
		sc.close();
	}

}
