package com.map;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * WAP to create a ArrayList Student which contain rollno,name,arrayList marks,percentage ,
 * grade.
From 
Above arrayList of student , create a Map which having key as a grade and value is ArrayList<Student> 
 * */


public class Student2 {

	private int id;
	private String name;
	private ArrayList<Integer>marks;
	private double percentage;
	private String grade;
	
	
	public Student2() {

	}
	public Student2(int id, String name, ArrayList<Integer> marks) {

		this.id = id;
		this.name = name;
		this.marks = marks;
		calpercentage();
		grade();
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
	public ArrayList<Integer> getMarks() {
		return marks;
	}
	public void setMarks(ArrayList<Integer> marks) {
		this.marks = marks;
	}
	public double calpercentage() {
		
		double sum=0;
    	for(int i:marks)
    		sum=sum+i;
    	percentage=(sum*100)/(marks.size()*100);
		return percentage;
	}
	public String grade() {
		if(percentage>=90)
			grade="A+";
		else if (percentage>=80)
			grade="A";
		else if (percentage>=70)
			grade="B+";
		else if (percentage>=60)
			grade="B";
		else if (percentage>=50)
			grade="C";
		else if (percentage>=35)
			grade="D";
		else
			grade="Fail";
		
		return grade;
			
	}
	@Override
	public String toString() {
		return "\nStudent id = " + id + " ,Student name = " + name + ", marks=" + marks + ", percentage=" + percentage + ", grade="
				+ grade;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr=new  ArrayList<Integer>(Arrays.asList(78,56,90,45,88));
		Student2 obj=new Student2(1,"Aaaa",arr);
		System.out.println(obj);
	}
	
}
