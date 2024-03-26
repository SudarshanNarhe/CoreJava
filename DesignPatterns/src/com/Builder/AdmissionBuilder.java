package com.Builder;

public class AdmissionBuilder {
	
	private int id;
	private String name;
	private double marks;
	private String SpecialSub;
	private String Course;
	
	
	public AdmissionBuilder setId(int id) {
		this.id = id;
		return this;
	}

	public AdmissionBuilder setName(String name) {
		this.name = name;
		return this;
	}
	
	public AdmissionBuilder setMarks(double marks) {
		this.marks = marks;
		return this;
	}
	
	public AdmissionBuilder setSpecialSub(String specialSub) {
		SpecialSub = specialSub;
		return this;
	}
	
	public AdmissionBuilder setCourse(String course) {
		Course = course;
		return this;
	}
	
	public Student getAdmission() {
		
		return new Student(id, name, marks, SpecialSub, Course);
	}
	
}
