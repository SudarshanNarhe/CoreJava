package com.alphabets;

public class LeftAngledAndReverse {

	public static void main(String[] args) {
		int n=6;
		char ch='K';
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++)
			{
				System.out.print((char)(ch+(j-1)));
			}
			System.out.println();
		} 
		for (int i=n-1;i>=1;i--)
		{
			for (int j=1;j<=n-i;j++)
			{
				System.out.print(" ");          
			}
			for (int j=1;j<=i;j++)
			{
				System.out.print((char)(ch+(j-1)));
			}
			System.out.println();
		}

	}

}
