package com.problems;

public class CreateClassAndObject {

	int age;
	String name;
	
	public void setData(int aage, String nam)
	{
		age=aage;
		name=nam;
		System.out.println("The age of a "+name+" is : "+age);
	}
	
	
	public static void main(String[] args) {
		
		int age =45;
		String name="Ketan";
		
		CreateClassAndObject obj=new CreateClassAndObject();
		obj.setData(age, name);
		

	}

}
