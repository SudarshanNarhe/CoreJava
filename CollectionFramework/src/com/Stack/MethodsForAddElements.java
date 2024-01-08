package com.Stack;

import java.util.Stack;

public class MethodsForAddElements {

	public static void main(String[] args) {
		
		// Use  different method calls to add elements to a Stack.

		Stack<Integer> num= new Stack<Integer>();
		num.add(24); //method of collection
		num.push(78); //method of stack
		num.addElement(90); //method of vector
		
		System.out.println("Original \n"+num);
		num.add(1, 80); //but we cannot use both the approach its become more complicated
		System.out.println("Add By index : \n"+num);
		
		//num.removeAllElements();
		//WAP to check if a Stack has values
		System.out.println(num.empty());
	}

}
