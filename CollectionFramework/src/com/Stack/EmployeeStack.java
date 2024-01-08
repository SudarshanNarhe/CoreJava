package com.Stack;

import java.util.Iterator;
import java.util.Stack;

public class EmployeeStack {

	public static void main(String[] args) {
		//  WAP to create a Stack using generics and add user defined class objects which implements comparable interface. 
		//Observe order when removing from Stack.
		
		Stack<Employee> std= new Stack<>();
		std.push(new Employee(11, "Sudarshan", 95000));
		std.push(new Employee(12,"Utkarsha",65000));
		std.push(new Employee(13,"Suraj",73600));
		std.push(new Employee(14,"Snehal",83000));
		std.push(new Employee(15,"Sujit",62000));
		
		Iterator<Employee> itr= std.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----------------------------------");
		System.out.println("Remove by pop: ");
		while(!std.empty()) {
			System.out.println(std.pop());
		}
		System.out.println("----------------------------------");
		System.out.println(std.isEmpty());
		

	}

}
