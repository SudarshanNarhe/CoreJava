package com.test2;

class S
{
	static int i=6;
	static 
	{
		i=i-- - --i;
	}
}

class B extends S 
{
	static 
	{
		i=--i -i--;
	}
}

public class MainClass {

	public static void main(String[] args) {
		
//		B b =new B(); 
//		System.out.println(b.i);

	}

}
