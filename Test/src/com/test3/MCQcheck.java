package com.test3;

public class MCQcheck {

	public static void gfg(P p)
	{
		System.out.println("p");
		
	}
	public static void gfg(Q q)
	{
		System.out.println("q");
	}
	
	public static void main(String[] args) {
		
		gfg(null);
		
	}
	
}

class P
{
	
}

class Q extends P
{
	
}