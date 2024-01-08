package com.whileLoop;

public class EvenNumbers {

	public static void main(String[] args) {
		// WAP to print even numbers from 121 to 229 using do-while loop
		int num1=121;
		int num2=229;
		do
		{
			if (num1%2==0)
				System.out.println(num1);
			 num1++;
		}while(num1<=num2);

	}

}
