package com.ternary;

public class GreaterNumber {

	public static void main(String[] args) {
//		if (num1>num2)
//		{
//			if (num1>num3)
//				System.out.println("The greater number is : "+num1); 
//			else 
//				System.out.println("The greater number is : "+num3);
//		}
//		else 
//		{
//			if (num2>num3)
//				System.out.println("The greater number is : "+num2);
//			else 
//				System.out.println("The greater number is : "+num3);
//		}
		int num1 = 90;
		int num2 = 40;
		int num3 = 50;
		
		int greatest= (num1>num2)?(num1>num3?num1:num3):(num2>num3?num2:num3);
		System.out.println("The greatest number is "+greatest);
	}

}
