package com.forLoop;

import java.util.Scanner;

public class SeriesPrinting {

	public static void main(String[] args) {
		// ⦁	Print Series 2 -4 6 -8………n terms
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number till you want to print the series : ");
		int num = sc.nextInt();
		int diff=2;
		for (int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.println(-diff);
			}
			else 
				System.out.println(diff);
			diff+=2;
		}
		
sc.close();
	}

}
