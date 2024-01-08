package com.array_of_Object;

//import java.util.Arrays;

public class Student {

	int roll;
	String name;
	double per;
	int []marks;
	
	public Student()
	{
		//default
	}
	public Student(int roll, String name, int marks[])
	{
		this.roll=roll;
		this.name=name;
		this.marks=marks;
	}
	public void setRoll(int id)
	{
		this.roll=id;
	}
	public int getRoll()
	{
		return roll;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setMarks(int marks[])
	{
		this.marks=marks;
	}
	public int [] getMarks()
	{
		return marks;
	}
	public double calPer()
	{	
		
		double total=0;
		for(int i=0;i<marks.length;i++)
		{
			total=total+marks[i];
		}
		per=(total*100)/(marks.length*100);
		System.out.println(per);
		return per;

	}
	public void max(Student m[])
	{	
		
		for(int i=0;i<m.length;i++)
		{
			m[i].calPer();
		}
		double max=0;
		String name="";
		for(int i=0;i<m.length;i++)
		{
			if (m[i].per > max)
			{
				max =m[i].per;
				name=m[i].getName();
			}
		}
		System.out.println(name+" having maximum Marks : "+max);
		
		
	}
	
	public void average(Student a[])
	{	
		double avg=0;
		double sum=0;
		for(int i=0;i<a.length;i++) 
		{	
			sum= sum+a[i].calPer();
			avg=sum/a.length; 
		}
			System.out.println("The average of percenatage is : "+avg);
		
		
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name;
	}
	public static void main(String[] args) {
		
		int m1[]= {70,76,89,60,83};
		int m2[]= {91,82,79,50,82};
		int m3[]= {67,83,92,83,74};
		int m4[]= {80,72,91,73,87};
		int m5[]= {93,71,79,81,70};
		
		Student std[]= new Student[5];
		std[0]= new Student(1,"Sumit",m1);
		std[1]= new Student(2, "Abhi", m2);
		std[2]= new Student(3, "Aadarsh", m3);
		std[3]= new Student(4, "Sudarshan", m4);
		std[4]= new Student(5, "Suraj", m5);
		
		
		for(int i=0;i<std.length;i++)
		{		
			System.out.println(std[i]);
			std[i].calPer();
		}
		System.out.println("__________________________________");
		Student obj= new Student();
			obj.max(std);
		System.out.println("___________________________________");
			obj.average(std);
	}

}
