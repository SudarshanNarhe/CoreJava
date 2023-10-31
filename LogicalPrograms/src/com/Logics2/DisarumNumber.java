package com.Logics2;

import java.util.Scanner;

public class DisarumNumber {

	
	static int count(int n)
	{	
		int count=0;
		while (n>0)
		{
			count++;
			n/=10;
		}
		return count;
	}	
		
		static boolean checkDisarum(int n)
		{
			boolean status;
			int sum=0;
			int original=n;
		while (n>0)
		{
			int rem=n%10;
			int count =count(n);
			int power=1;
			for (int i=1;i<=count;i++)
			{
				power=power*rem;
			}
			count--;
			sum=sum+power;
			n/=10;
		}

		if(sum==original)
			status=true;
		else 
			status=false;
		
		return status;	
	}
	public static void main(String[] args) {
		//⦁	Disarum no 135=1+3*3+5*5*5=135
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num=sc.nextInt();
		if(checkDisarum(num))
			System.out.println("Its a Disarum number.");
		else 
			System.out.println("Its NOT a Disarum number.");
		
sc.close();
	}

}
