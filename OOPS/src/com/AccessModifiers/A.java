package com.AccessModifiers;

import static java.lang.System.out;

public class A {
	
	public int i=10;
	private int j =20;
	protected int k=30;
	int l =40;
	protected A()
	{
		
	}
	public A(int a )
	{
		
	}
	public void display()
	{
		out.println(i);
		out.println(j);
		out.println(k);
		out.println(l);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		obj.display();
	}

}
