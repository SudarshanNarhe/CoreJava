package com.LinkedList;

public class Student {
	int id;
	String name;
	double percentage;
	public Student() {
		
	}
	public Student(int id, String name, double per) {
		this.id=id;
		this.name=name;
		this.percentage=per;
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
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "\nStudent [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
}
