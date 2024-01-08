package com.Stack;

import java.util.Iterator;
import java.util.Stack;

public class Colors {

	public static void main(String[] args) {
		
		// WAP to create a Stack with some colors (String); using generics
		
		Stack<String> color= new Stack<String>();
		color.add("Blue");
		color.push("Red");
		color.push("Orange");
		color.push("Yellow");
		color.add("Black");
		
		Iterator<String> itr = color.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
