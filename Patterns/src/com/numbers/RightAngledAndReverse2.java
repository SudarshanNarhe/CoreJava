package com.numbers;

public class RightAngledAndReverse2 {

	public static void main(String[] args) {
		int n=9;
		for (int i=1;i<=n;i=i+2)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
		for (int i=n-2 ;i>=1;i=i-2)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
