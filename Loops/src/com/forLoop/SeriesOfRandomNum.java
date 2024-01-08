package com.forLoop;

public class SeriesOfRandomNum {

	public static void main(String[] args) {
		// ⦁	Write the program in Java to display the first ten terms of the following series:
		//1, 2, 4, 7, 11,
		int a=1;
		int b=0;
		for(int i=1;i<=10;i++)   //for(int i=1;i<=10;i++,b++)
		{
			a=a+b;
			System.out.println(a);
			b++;
		}
	}

}
