package com.alphabets;

public class Diamond {

	public static void main(String[] args) {
		int n=5;
		char ch='L';
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=2*i-1;j++)
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
			for (int j=1;j<=2*i-1;j++)
			{
				System.out.print((char)(ch+(j-1)));
			}
			System.out.println();
		}

	}

}
