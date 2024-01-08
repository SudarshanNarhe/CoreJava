package com.AprilWritten;

import java.util.Comparator;
import java.util.PriorityQueue;

/*21) There are a number of students in a school who wait to be served. 
 * Two types of events, ENTER and SERVED, can take place which are described below.[2M]
1)ENTER: A student with some priority enters the queue to be served.
2)SERVED: The student with the highest priority is served (removed) from the queue.
        A unique id is assigned to each student entering the queue. 
WAP to create  queue  using  Comparator students based on the following criteria (priority criteria):
1)The student having the highest marks is served first.
2)Any students having the same marks will be served by name in ascending case-sensitive alphabetical order.
*/

class Student3 {
	int stdid;
	String name;
	int marks;
	
	public Student3() {
		
		
	}

	public Student3(int stdid, String name, int marks) {
		super();
		this.stdid = stdid;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "\nStudent [stdid=" + stdid + ", name=" + name + ", marks=" + marks + "]";
	}

	
		
};

class CompareByIDAndName implements Comparator<Student3>{

	@Override
	public int compare(Student3 o1, Student3 o2) {
		if(o1.marks==o2.marks) 
			return o1.name.compareTo(o2.name);
		else if(o1.marks>o2.marks)
			return -1;
		else 
			return 1;
	}
	
	
	
}

public class Que21 {
	
	public static void main(String[] args) {
		
		Student3 s1 = new Student3(1, "Sudarshan", 80);
		Student3 s2 = new Student3(2, "Yogesh", 70);
		Student3 s3 = new Student3(3, "Anil", 40);
		Student3 s4 = new Student3(4, "Sunil", 60);
		Student3 s5 = new Student3(5, "Amit", 80);
		Student3 s6 = new Student3(6, "Suraj", 90);
		Student3 s7 = new Student3(7, "Aadarsh", 30);
		Student3 s8 = new Student3(8, "Ishwar", 67);
			
		
	//	PriorityQueue<Student3> std= new PriorityQueue<Student3>(Comparator.comparingInt((Student3 s) -> s.marks).reversed().thenComparing(s ->s.name));
		PriorityQueue<Student3> std= new PriorityQueue<Student3>(new CompareByIDAndName());
		std.add(s1);
		std.add(s2);
		std.add(s3);
		std.add(s4);
		std.add(s5);
		std.add(s6);
		std.add(s7);
		std.add(s8);
		
		
		
		while(!std.isEmpty()) {
			System.out.println(std.poll());
		}
		
		
	}

	
}
