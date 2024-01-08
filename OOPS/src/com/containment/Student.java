package com.containment;

/*WAP to have Department class created with id, name . Student class has
roll, name and Department object should have id and name. Assign and
print individual values in main method*/

public class Student {

	private int rollno;
	private String name;
	
	public Student ()
	{
		
	}
	public Student(int rollno, String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	public void setRollno(int roll)
	{
		rollno=roll;
	}
	public int getRollno()
	{
		return rollno;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		return "Name of Student : "+name+"\nRoll no : "+rollno;
	}
	
	
	public static void main(String[] args) {
		
		Student obj =new Student(23,"Sudarshan");
		System.out.println(obj);
		obj.setName("Pavan");
		obj.setRollno(42);
		System.out.println(obj);
		

	}

}
