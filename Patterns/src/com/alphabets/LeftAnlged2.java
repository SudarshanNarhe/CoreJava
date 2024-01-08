package com.alphabets;

public class LeftAnlged2 {

	public static void main(String[] args) {

		int n=6;
		int ch='A';
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=1+n-i;j--)							
			{											
				System.out.print((char)(ch+(j-1))+" ");
			}
			System.out.println();
		}

	}

}
