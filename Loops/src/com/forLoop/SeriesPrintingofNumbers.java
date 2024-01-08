package com.forLoop;

import java.util.Scanner;

public class SeriesPrintingofNumbers {

	public static void main(String[] args) {
		// ⦁	Print Series 1  11  111  111……..n terms
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a terms till you want to print : ");
		int term=sc.nextInt();
		int diff=1;
		for(int i=1;i<=term;i++)
		{
			System.out.print(diff+"  ");
				diff=(diff*10)+1;
		}
sc.close();
	}

}
