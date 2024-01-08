package com.test2;

public class ConstructorChaining {

	ConstructorChaining()
	{
		System.out.println("I am in default...");
	}
	ConstructorChaining(int num)
	{
		this();   // this. is used for calling one constructor to another is called constructor chaining
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		
		new ConstructorChaining(8);
	}

}
