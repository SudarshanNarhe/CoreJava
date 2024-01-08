package com.whileLoop;

public class OddNumbers {
	
	public static void main(String[] args) {
		//WAP to print odd numbers from 521 to 229 using while loop
		int num1=521;
		int num2=229;
		while (num1>=num2)
		{
			if (num1%2!=0)
				System.out.println(num1);
			num1--;
		}
		
	}
}
