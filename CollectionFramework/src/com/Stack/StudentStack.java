package com.Stack;

import java.util.Iterator;
import java.util.Stack;

public class StudentStack {

	public static void main(String[] args) {
		
		  //WAP to create a Stack with user defined class objects &amp; using generics
		
		Stack<Student> std= new Stack<Student>();
		std.add(new Student(11, "Sudarshan"));
		std.add(new Student(18, "Pavan"));
		std.add(new Student(25,"Ishwar"));
		std.add(new Student(14,"Utkarsha"));
		std.add(new Student(23,"Suraj"));
		std.add(new Student(16,"Aadarsh"));
		
		Iterator<Student>itr= std.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Top : "+std.peek());
	}

}
