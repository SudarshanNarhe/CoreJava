package com.Logics2;

import java.util.Scanner;

public class GreatestCommonDivisior {

	static int checkGCD(int n1, int n2)
	{   
		int gcd=1;
		for(int i=1;i<=n1&&i<=n2;i++)
		{
			if((n1%i==0)&&(n2%i==0))
			{
				gcd=i;
			}
		}
		return gcd;
	}
	
	public static void main(String[] args) {
		  Scanner sc=new Scanner (System.in);
		  System.out.println("Enter first number : ");
		  int num1=sc.nextInt();
		  System.out.println("Enter a second number : ");
		  int num2=sc.nextInt();
		  int gcd=checkGCD(num1,num2);
		  {
			  System.out.println("The highest common divisior of "+num1+ " and "+num2+" is : "+gcd);
		  }
		  
sc.close();		  
	}

}
