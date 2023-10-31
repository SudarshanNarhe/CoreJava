package com.Logics;

public class FindFactorial {
	static long findfactorial(int num)
	{
		long fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		return fact; // only return one value
	}
	public static void main(String[] args) {
		long fact1=findfactorial(6);
		System.out.println(fact1);
		
		System.out.println(findfactorial(7));

	}

}
