package com.diwali3;

public interface SomethingIsWrong {

	/*
	 * we cannot implements the abstracts methods we only implements the static and
	 * default methods in interface
	 * 
	 * void aMethod(int aValue) {          System.out.println("Hi Mom");      }
	 */

	
	// Step 1
	// to resolve these problem we required to change the method as...
	  default void aMethod(int aValue) {
	 
	  System.out.println("Hi Mom"); 
	  }
	 

	// Step 2
	// OR as a making its a static
	static void aMethod1(int aValue) {

		System.out.println("Hi Mom");
	}

	// Step 3
	// remove a body of that method

	void aMethod2(int aValue);

}
