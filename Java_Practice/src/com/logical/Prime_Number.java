package com.logical;

public class Prime_Number {

	public static void checkPrime(int num)
	{
		boolean status= true;
		if((num==0)||(num==1))
		{
			status = false;
		}
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				status=false;
				break;
			}
			else
				status=true;
		}
		if(status)
		{
			System.out.println("The Prime number : "+num);
		}
		else
		{
			System.out.println("Not a prime number");
		}
	}
	public static void printTable(int num)
	{	
		int prd;
		for(int i=1;i<=10;i++)
		{
			prd=num*i;
			System.out.println(prd);
		}
	}
	public static void main(String[] args) {
		
//		checkPrime(23);
//		for(int i=45;i<102;i++)
//		{
//			checkPrime(i);
//		}
		
		printTable(7);
		
	}

}
