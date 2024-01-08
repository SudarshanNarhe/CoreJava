package com.diwali3;


class A {
	
	{
		System.out.println("1");
	}
	
}

class BB extends A {
	{
		System.out.println("2");
	}
}

class CC extends BB {
	{
		System.out.println("3");
	}
}

public class Temp2 {
	
	public static void main(String[] args)
	{
		CC c = new CC();
		System.out.println(c); // it is just to avoid that warning... 
	}
	
}
