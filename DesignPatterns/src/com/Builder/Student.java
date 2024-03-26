package com.Builder;

public class Student {
	
	
	private int id;
	private String name;
	private double marks;
	private String SpecialSub;
	private String Course;
	
	public Student(int id, String name, double marks, String specialSub, String course) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		SpecialSub = specialSub;
		Course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", SpecialSub=" + SpecialSub + ", Course="
				+ Course + "]";
	}
	
	
	
}
