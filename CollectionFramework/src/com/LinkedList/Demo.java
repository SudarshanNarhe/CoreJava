package com.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo {
	
	
	public static void main(String[] args) {
			
		ArrayList<Student> std= new ArrayList<Student>();
		std.add(new Student(11, "Sudarshan", 79.23));
		std.add(new Student(23,"Pavan",87.34));
		std.add(new Student(41, "Yogesh", 97.32));
		std.add(new Student(8, "Suraj", 79.41));
		std.add(new Student(5, "Ishwar", 78.14));
		
		//System.out.println("********"+std.get(1));
		
		LinkedList<Student> std1= new LinkedList<Student>();
		std1.add(new Student(11, "Sudarshan", 79.23));
		std1.add(new Student(23,"Pavan",87.34));
		std1.add(new Student(41, "Yogesh", 97.32));
		std1.add(new Student(8, "Suraj", 79.41));
		std1.add(new Student(5, "Ishwar", 78.14));
		
		//System.out.println(std.get(2));
		
		std1.addFirst(new Student(56,"Aadarsh",82.67));
		System.out.println("Add First : "+std1);
		std1.add(4, new Student(7, "Sakshi",98.67));
		System.out.println("Add at Index 4 : "+std1);
		std1.remove();
		System.out.println("Remove : "+std1);
		std1.remove(2);
		System.out.println("Remove at Index 2 : "+std1);
		std1.addLast(new Student(89,"Utkarsha",79.31));
		System.out.println("Add Last : "+std1);
		std1.removeLast();
		System.out.println("Remove Last : "+std1);
		System.out.println("Get First : "+std1.getFirst());
		System.out.println("Get Last : "+std1.getLast());
		
	}

}
