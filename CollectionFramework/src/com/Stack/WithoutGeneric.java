package com.Stack;

import java.util.Stack;

public class WithoutGeneric {

	public static void main(String[] args) {
		
		//WAP to create a Stack with Integer objects without using generics
		
		Stack num= new Stack();
		num.add(19);
		num.add(20);
		num.add(21);
		num.add(34);
		
		System.out.println(num);

	}

}
