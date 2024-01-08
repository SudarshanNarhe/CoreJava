package com.ArrayList;

import java.util.ArrayList;

public class Student implements Comparable<Student>{

	int roll;
	String name;
	ArrayList<Integer>mark;
	double per;
	String grade;
	public Student() {
		
	}
	public Student(int roll, String name, ArrayList<Integer>mark) {
		
		this.roll=roll;
		this.name=name;
		this.mark=mark;
		this.calPercenatge();
		this.grade();
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void calPercenatge() {
		
		int sum=0;
		for(int m : mark) {
			sum+=m;
		}
		per=(sum*100)/(mark.size()*100);
	}
	public void grade() {
		if(per>=90)
			grade="A+";
		else if (per>=80)
			grade="A";
		else if (per>=70)
			grade="B+";
		else if (per>=60)
			grade="B";
		else if (per>=50)
			grade="C";
		else if (per>=35)
			grade="D";
		else
			grade="Fail";
			
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", mark=" + mark + ", per=" + per + ", grade=" + grade
				+ "]";
	}
	@Override
	public int compareTo(Student o) {
		if(this.per==o.per)
			return 0;
		else if(this.per <o.per)
			return 1;
		else
			return -1;
	}
	
}
