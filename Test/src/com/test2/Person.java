package com.test2;

public class Person {

	int id1;
	String name;
	long mob;
	Job j;
	
	Person()
	{
		
	}
	public Person(int id, String name, long mob, Job j)
	{
		this.id1=id;
		this.name=name;
		this.mob=mob;
		this.j=j;			
	}
	public String toString()
	{
		return "Name :"+name+"\nPerson Id : "+id1+"\nMobile no : "+mob+"\n"+j;
	}
	public static void main(String[] args) {
		
		Person obj = new Person(12,"Sudarshan",1232442234,new Job(102,"Traainee",450000));
		System.out.println(obj);
		
	}

}
