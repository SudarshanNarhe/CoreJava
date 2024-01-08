package com.array;

/*Create array of students, student has (roll, name, age, marks). Print only
those students who have marks more than 60 and age is less than 15.*/

public class StudentAndMarks {

	private int roll;
	private String name;
	private int age;
	private double marks;
	
	public StudentAndMarks()
	{
		
	}
	public StudentAndMarks(int roll, String name ,int age,  double marks)
	{
		this.roll=roll;
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	
	
	public static void main(String[] args) {
		
		StudentAndMarks std[]=new StudentAndMarks[5];
		std[0]= new StudentAndMarks(23,"Sudarshan",13,85);
		std[1]= new StudentAndMarks(2,"Pavan",13,65);
		std[2]= new StudentAndMarks(7,"Rakesh",14,55);
		std[3]= new StudentAndMarks(9,"Rahul",23,63);
		std[4]= new StudentAndMarks(13,"Rajesh",12,77);
		
		for(int i=0;i<std.length;i++)
		{
			if (std[i].marks > 60 && std[i].age < 15)
			{
                System.out.println("Roll: " + std[i].roll);
                System.out.println("Name: " + std[i].name);
                System.out.println("Age: " + std[i].age);
                System.out.println("Marks: " + std[i].marks);
                System.out.println("----------------------------");
			}
		}
	}
}


