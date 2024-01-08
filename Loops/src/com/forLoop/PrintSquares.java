package com.forLoop;

public class PrintSquares {

	public static void main(String[] args) {
		// WAP to print squares from 1 to 20
		int square=1;
		for(int i=1;i<=20;i++)
		{
			square=i*i;
			System.out.println("The Square of "+i+ " is : "+square);
		}

	}

}
