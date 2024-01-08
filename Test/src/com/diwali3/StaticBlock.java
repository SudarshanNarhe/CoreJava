package com.diwali3;

class A1 
{	
	static int i;
	static {
		System.out.println("1");
		i=100;
	}
}

public class StaticBlock {
	
	static {
		System.out.println("2");
	}
	public static void main(String[] args) {
		
		System.out.println("3");
		System.out.println(A1.i);
	}

}
