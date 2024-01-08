package com.basic;

import java.util.Scanner;

public class PrimeNumbers {

	public static void show(int num[])
	{
		System.out.println("The numbers are : ");
		for(int sk : num)
			System.out.println(sk);
	}
	public static int []arrayCreation()
	{
		int num[];
		System.out.println("Enter a size of array : ");
		Scanner sc= new Scanner(System.in);
		int size= sc.nextInt();
		num= new int[size];
		for(int i=0;i<num.length;i++)
		{
			System.out.println("Enter "+(i+1)+" number : ");
			num[i]=sc.nextInt();
		}
		sc.close();
		return num;

	}
	public static void checkPrime(int num[])
	{
		boolean status = true;
		System.out.println("The prime numbers are : ");
		for(int i=0;i<num.length;i++)
		{
			if((num[i]==0) ||(num[i]==1) )
			{
				System.out.println("1 and 0 are not prime numbers.");
				break;
			}
			else
			{
				for(int j=2;j<num[i];j++)
				{
					if(num[i]%j==0)
					{
						status = false;	
						break;
					}
					else 
						status = true;
					    
					
				}
				
			}
			if(status)
			{	
				System.out.println(num[i]);
			}
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		int n[]= arrayCreation();
		show(n);
		checkPrime(n);

	}

}
