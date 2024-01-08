package com.forLoop;

public class SeriesOfSquare {

	public static void main(String[] args) {
		// ⦁	Write the program in Java to display the first ten terms of the following series:
		//1, 4, 9, 16,
		int square=0;
		for(int i=1;i<=10;i++)
		{ 
			square=i*i;
			System.out.println(square);		
		}
	}

}
