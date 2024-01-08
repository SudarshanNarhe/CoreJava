package com.methods;

public class Overload {

	public void add(int i, int j)
	{
		int a=i+j;
		System.out.println(a);
	}
	public void sub(int i, int j)
	{
		int a=i-j;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		Overload obj=new Overload ();
		obj.add(3, 5);
		obj.sub(7, 3);

	}

}
