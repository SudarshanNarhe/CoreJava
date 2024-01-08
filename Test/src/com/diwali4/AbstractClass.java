package com.diwali4;

abstract class Abs {
	
	abstract void abstractMethod();

	{
		System.out.println("First Method");

	}
}

public class AbstractClass extends Abs {
	void abstractMethod() {
		System.out.println("This is my implementation");
	}

	public static void main(String s[]) {
		AbstractClass ab = new AbstractClass();
		ab.abstractMethod();
	}
}

