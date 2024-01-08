package com.Queue;

import java.util.Comparator;

public class Student {  //implements Comparable<Student>{

	int id;
	String name;
	
	public Student() {
		
	}
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
//	@Override
//	public int compareTo(Student o) {
//		//System.out.println("I am in Comarable");
//		if(this.id>o.id)
//		return 1;
//		else if(this.id<o.id)
//			return -1;
//		else
//			return 0;
//	}
	
}

class SortByComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.id>o2.id)
			return 1;
			else if(o1.id<o2.id)
				return -1;
			else
				return 0;
	}
	
}
