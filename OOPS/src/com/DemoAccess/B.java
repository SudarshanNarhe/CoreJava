package com.DemoAccess;

import com.AccessModifiers.A;

public class B extends A{

	B() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		B obj = new B();
		System.out.println(obj.i);
		System.out.println(obj.k);
		
		/*
		 * the private and default is not accessible and only protected is accessible thr' inheritance.
		 * 
		 */

	}

}
