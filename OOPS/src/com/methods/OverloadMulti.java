package com.methods;

public class OverloadMulti {

	public void multi(int a, int b)
	{
		System.out.println("Multi int int is : "+a*b);
	}
	public void multi(int a, int b, int c)
	{
		System.out.println("Multi int int int is : "+a*b*c);
	}
	public void multi(float a, float b)
	{
		System.out.println("Multi float float is : "+a*b);
	}
	public void multi (double a, double b, double c)
	{
		System.out.println("Multi double double double is : "+a*b*c);
	}
	
	public static void main(String[] args) {
		
		OverloadMulti obj= new OverloadMulti();
		obj.multi(2, 3);
		obj.multi(2.3f, 5.0f);
		obj.multi(10, 5, 3);
		obj.multi(4.2, 5.1, 3.6);
		

	}

}
