package com.clone;

class CourseS implements Cloneable{
	
	String sub1;
	String sub2;
	String sub3;
	
	public CourseS() {
		// TODO Auto-generated constructor stub
	}

	public CourseS(String sub1, String sub2, String sub3) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}

	@Override
	public String toString() {
		return "Course [sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3 + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
}

public class StudentDeep implements Cloneable{
	 int id ;
	 String name;
	 CourseS c;
	 
	 public StudentDeep() {
		
	}
	 
	public StudentDeep(int id, String name, CourseS c) {
		super();
		this.id = id;
		this.name = name;
		this.c = c;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		StudentDeep std = (StudentDeep)super.clone();
		std.c = (CourseS) c.clone();
		return std;
		
	}
	@Override
	public String toString() {
		return "StudentDeep [id=" + id + ", name=" + name + ", c=" + c + "]";
	}
	
	
	public static void main(String[] args) {
		
		CourseS c= new CourseS("Math","Biology","Chemistry");
		StudentDeep std = new StudentDeep(23, "Sudarshan", c);
		StudentDeep std2=null;
		
		try
		{
			std2=(StudentDeep) std.clone();
		} 
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println(std);
		System.out.println(std2);
		System.out.println("------------------------------");
		
		System.out.println(std.c.sub2);
		System.out.println("------------------------------");
		
		std2.c.sub2="Physics";
		
		System.out.println(std.c.sub2);
		System.out.println(std2.c.sub2);
		System.out.println("------------------------------");
		
		System.out.println(std);
		System.out.println(std2);
		System.out.println("------------------------------");
		
		std.c.sub1="Marathi";
		System.out.println(std);
		System.out.println(std2);
		
		
		
	}

}
