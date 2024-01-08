package com.Stack;

import java.util.Iterator;
import java.util.Stack;

public class DemoAndMethods {

	public static void main(String[] args) {
		
		Stack<Integer> num= new Stack<Integer>();
		num.push(100);
		num.push(23);
		num.push(10);
		num.push(78);
		num.add(97);
		
		System.out.println(num);
		
		System.out.println("Using Iterator : ");
		Iterator<Integer> itr = num.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		System.out.println("Peek : "+num.peek());
		System.out.println(num);
		System.out.println("Position : "+num.search(10));
		
		System.out.println("Remove Elements : ");
		while(!num.empty()) {
			System.out.println(num.pop());
		}
		System.out.println("Check empty : "+num.isEmpty());
	}

}
