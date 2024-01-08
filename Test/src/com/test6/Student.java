package com.test6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Student {

	int id;
	String name;
	String degree;
	int passingYear;
	boolean placed;
	
	public Student() {
		
	}

	public Student(int id, String name, String degree, int passingYear, boolean placed) {
		super();
		this.id = id;
		this.name = name;
		this.degree = degree;
		this.passingYear = passingYear;
		this.placed = placed;
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

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public int getPassingYear() {
		return passingYear;
	}

	public void setPassingYear(int passingYear) {
		this.passingYear = passingYear;
	}

	public boolean isPlaced() {
		return placed;
	}

	public void setPlaced(boolean placed) {
		this.placed = placed;
	}

	@Override
	public String toString() {
		return "\nStudent id=" + id + ", name=" + name + ", degree=" + degree + ", passingYear=" + passingYear
				+ ", placed=" + placed + "]";
	}
	
	public static void main(String[] args) {
		
		HashSet<Student> std = new HashSet<Student>();
		std.add(new Student(1, "Sudarshan", "B.H.M.C.T", 2022, true));
		std.add(new Student(2, "Ajit", "B.E.", 2021, false));
		std.add(new Student(3, "Vijay", "CS", 2022, false));
		std.add(new Student(4, "Ishawar", "Bsc", 2023, true));
		std.add(new Student(5, "Suraj", "Bcom", 2020, true));
		std.add(new Student(6, "Aadarsh", "Animation", 2023, false));
		std.add(new Student(7, "Laxman", "Wine Technology", 2019, true));
		
		ArrayList<Student> placed = new ArrayList<Student>();
		ArrayList<Student> notPlaced = new ArrayList<Student>();
		
		Iterator<Student> itr = std.iterator();
		while(itr.hasNext()) {
			Student s= itr.next();
			if(s.placed) {
				placed.add(s);
			}
			else
				notPlaced.add(s);
			itr.remove();
		}
		System.out.println("The Students which are placed : ");
		System.out.println(placed);
		
		System.out.println("\nThe Students which are NOT placed : ");
		System.out.println(notPlaced);
		
		System.out.println("\nHashSet contain Nothing : "+std.isEmpty());
	}
	
	
}
