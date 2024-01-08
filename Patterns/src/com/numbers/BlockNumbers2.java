package com.numbers;

import java.util.Scanner;

public class BlockNumbers2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number of rows and columns : ");
		int n=sc.nextInt();
		System.out.println("Enter a first number  : ");
		int n1=sc.nextInt();
		System.out.println("Enter a second number : ");
		int n2=sc.nextInt();
	
		for (int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				for (int j=1;j<=n;j++)
				{
					if(j%2!=0)
					{
						System.out.print(n1);
					}
					else 
						System.out.print(n2);
				}
			}
				else 
				{
					for (int j=1;j<=n;j++)
					{
						if(j%2==0)
						{
							System.out.print(n1);
						}
						else 
							System.out.print(n2);
					}
					
				}
				System.out.println();
			}
	sc.close();
		}
	}


