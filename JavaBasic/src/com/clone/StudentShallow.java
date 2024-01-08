package com.clone;

// Shallow Cloaning...

class Course {
	
	String sub1;
	String sub2;
	String sub3;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(String sub1, String sub2, String sub3) {
		super();
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}

	@Override
	public String toString() {
		return "Course [sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3 + "]";
	}
	
	
}


public class StudentShallow implements Cloneable{

	int id;
	String name;
	Course c;
	
	public StudentShallow() {
		// TODO Auto-generated constructor stub
	}
	
	public StudentShallow(int id, String name, Course c) {
		super();
		this.id = id;
		this.name = name;
		this.c = c;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", c=" + c + "]";
	}

	public static void main(String[] args) {
		
		StudentShallow std= new StudentShallow(12,"Aadarsh",new Course("Math","Biology","Chemistry"));
		StudentShallow std2=null;
		try
		{
			std2=(StudentShallow) std.clone();
		}
		catch (CloneNotSupportedException a)
		{
			a.printStackTrace();
		}
		System.out.println(std);
		System.out.println(std2);
		System.out.println("---------------------------------");
		
		//Printing the subject3 of 'student1'
		System.out.println(std.c.sub3);
		System.out.println("---------------------------------");
		
		//Changing the Subject from student 2
		std2.c.sub2="Physics";
		System.out.println("We have change the subject of second student : "+std.c.sub2);
		System.out.println("---------------------------------");
		
		//Printing the Subjects of Student1 and student2 
		System.out.println("Both Students output after changing the Subjects : ");
		System.out.println(std.c.sub2);	   //------>> It will give the same output
		System.out.println(std2.c.sub2);  // because it only refer a referances...
		System.out.println("---------------------------------");
		
		//Printing both objects again 
		System.out.println(std);
		System.out.println(std2);
		
	}

}
