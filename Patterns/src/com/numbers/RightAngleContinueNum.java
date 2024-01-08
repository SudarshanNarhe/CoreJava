package com.numbers;

public class RightAngleContinueNum {

	public static void main(String[] args) {
		int n=7;
		int m=0;
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print((m+=1)+" ");
			}
			System.out.println();
		}
	
	}

}
