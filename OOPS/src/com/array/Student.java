package com.array;

import java.util.Scanner;

public class Student {

	/*Write a student class which has rollno, 
	name , percentage, grade,and array of marks.*/
	
	private int rollno;
	private String name;
	private float percentage;
	private char grade;
	private int marks[]=new int [5];
	
	public Student(int roll, String name,int marks[])
	{
		this.rollno=roll;
		this.name=name;
		this.marks=marks;
				
	}
	public void percentage()
	{	
		float sum=0;
		for(int i=0;i<marks.length;i++)
		{
			sum+=marks[i];
		}
		percentage=(sum/500)*100;
	}
	public void grade()
	{
		if(percentage>80)
		     grade='A';
		else if(percentage>60)
			grade='B';
		else if(percentage>40)
			grade='C';
		else if(percentage>35)
			grade='D';
		else
			grade='F';
		
	}
	public String toString()
	{
		return " Name : "+name+" Rollno :"+rollno+ " Percentage :" +percentage+" Grade :"+grade;
	}
	
	public static void main(String[] args) {
		
		int submarks[]=new int [5];
		System.out.println("Enter marks of subjects : ");
		Scanner sc=new Scanner (System.in);
		
		for(int i=0;i<submarks.length;i++)
		{
			submarks[i]=sc.nextInt();
		}
		Student obj=new Student(23,"Sudarshan",submarks);
		obj.percentage();
		obj.grade();
		System.out.println(obj);
sc.close();
	}

}
