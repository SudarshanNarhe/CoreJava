package com.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class StudentQueue {

	public static void main(String[] args) {
		
		Student std1=new Student(25, "Sudarshan");
		Student std2= new Student(12,"Utkarsha");
		Student std3= new Student (10,"Suraj");
		Student std4= new Student(11,"Ishwar");
		Student std5= new Student(15,"Aadarsh");
		
		PriorityQueue<Student> std= new PriorityQueue<Student>(new SortByComparator());
		std.add(std1);
		std.add(std2);
		std.add(std3);
		std.add(std4);
		std.add(std5);
		
		std.offer(std5);
		Iterator<Student> itr =std.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----------------------------------------");
		Student s;
		while((s=std.poll())!=null) {
			System.out.println(s);
		}

	}

}
 