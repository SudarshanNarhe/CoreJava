package com.problems;

import java.util.Scanner;

public class Student {

	int rollno,sub1,sub2,sub3,sub4,sub5;
	double per,total;
	String name;
	
	public void setMarks(int roll, String nam,int a,int b,int c,int d,int e)
	{
	       sub1=a;
	       sub2=b;
	       sub3=c;
	       sub4=d;
	       sub5=e;
	       name=nam;
	       rollno=roll;
	}
	
	public void display()
	{
		System.out.println("Name= "+name);
		System.out.println("Roll no = "+rollno);
		System.out.println("Mark 1 = "+sub1);
		System.out.println("Mark 2= "+sub2);
		System.out.println("Mark 3= "+sub3);
		System.out.println("Mark 4= "+sub4);
		System.out.println("Mark 5= "+sub5);
		System.out.println("Percentage is = "+per+"%");
		
	}
	public void cal()
	{
		total=(sub1+sub2+sub3+sub4+sub5);
		per=total*100/500;
	}
	public void grade()
	{
		if(per>=80)
			System.out.println("A grade");
		else if(per>=60)
			System.out.println("B grade");
		else if(per>=35)
			System.out.println("C grade");
		else 
			System.out.println("Fail");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name= sc.next();
		System.out.println("Enter a roll no: ");
		int roll=sc.nextInt();
		System.out.println("Enter a mark of English :");
		int eng=sc.nextInt();
		System.out.println("Enter a mark of Biology :");
		int bio=sc.nextInt();
		System.out.println("Enter a mark of Physics :");
		int phy=sc.nextInt();
		System.out.println("Enter a mark of chemistry :");
		int chem=sc.nextInt();
		System.out.println("Enter a mark of Maths :");
		int math=sc.nextInt();
		Student obj=new Student();
		obj.setMarks(roll, name, eng, bio, phy, chem, math);
		obj.cal();
		obj.display();
		obj.grade();
		
		
sc.close();
	}

}
