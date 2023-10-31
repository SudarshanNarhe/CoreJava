package com.Logics2;

import java.util.Scanner;

public class Automorphic {
	
	static int count(int n)
	{
		int count =0;
		for(int i=1;i<=n;i++)
		{
			count++;
			n/=10;
		}
		return count;
	}
	
	static int tenPower(int base, int index)
	{
		int power=1;
		for(int i=1;i<=index;i++)
		{
			power=power*base;
		}
		return power;
	}
	
	
	static boolean checkAutomorphic(int n)
	{ 
		boolean status;
		int count=count(n);
		int tenPower=tenPower(10,count);
		int sq=n*n;
		int end = sq%tenPower;
		System.out.println("The Square is : "+sq);
		System.out.println("The original number is: "+n);
		System.out.println("The end number of square is : "+end);
		if(n==end)
		{
			status=true;
		}
		else 
			status= false;
		
		return status;
		
	}
	
	public static void main(String[] args) {
		    Scanner sc= new Scanner(System.in);
		    System.out.println("Enter any number : ");
		    int num=sc.nextInt();
		    boolean automor=checkAutomorphic(num);
		    if(automor)
		    {
		    	System.out.println("Its a Automorphic number.");
		    }
		    else
		    	System.out.println("Its not a Automorphic number.");
sc.close();		    
	}
}



