package com.oops;

public class Student {
		
	 int rollno;
	 String name;
	 int marks;
	 double per;
	
	 public  void setdata(int rn, String name, int mark)
	 {
		 rollno=rn;
		this. name=name;
		 this.marks=mark;
		 
	 }
	
	 public void calPer()
	 {
		 per = marks*100/500;
		 
	 }
	 public void display()
	 {
		 System.out.println("Name of the Student : "+name);
		 System.out.println("Roll no : "+rollno);
		 System.out.println("Percentage is : "+per);
	 }
	 
	public static void main(String[] args) {
		
//		 int rollno =23;
//		 String name= "Rushi";
//		 int marks = 350;
//		 double per = marks*100/500;
//		 
//		 System.out.println("Name : "+name+"\nRoll no : "+rollno+"\nPercentage : "+per);
//		
//		 int rollno1 =3;
//		 String name1= "Rushali";
//		 int marks1 = 40;
//		 double per1 = marks1*100/500;
//		 
//		 System.out.println("Name : "+name1+"\nRoll no : "+rollno1+"\nPercentage : "+per1);
//		
		
		Student std= new Student();
		std.setdata(34, "Rushi", 350);
		std.calPer();
		std.display();
		
		System.out.println(std.hashCode());
		
		
	}

}
