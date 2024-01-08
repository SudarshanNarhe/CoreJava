package com.forLoop;

public class ProductOfEven {

	public static void main(String[] args) {
	long prod=1;
	for (int i=1;i<=20;i++)
	{
		if(i%2==0)
		prod*=i;
	}
	System.out.println("The product of even numbers from 1 to 20 is : "+prod);
	}

}
