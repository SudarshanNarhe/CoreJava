package com.star;

public class Diamond {

	public static void main(String[] args) {
		int n= 5;
		for (int i=1;i<=n;i++)
		{
			//for Spaces
			for (int j=1; j<=(n-i);j++)
			{
				System.out.print(" ");
			}
			//for stars
			for (int j=1;j<=(2*i-1);j++)
			{
				System.out.print("*");
			}
		   System.out.println();
		}
		
		for (int i=n;i>=1;i--)
		{
			//for Spaces
			for (int j=1; j<=(n-i);j++)
			{
				System.out.print(" ");
			}
			//for stars
			for (int j=2;j<=(2*i-1);j++)
			{
				System.out.print("*");
			}
		   System.out.println();
		}

	}

}
