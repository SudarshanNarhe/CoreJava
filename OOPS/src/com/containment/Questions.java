package com.containment;

 /*WAP to use containment for following hierarchy. Fill all data and print all
data: (id is a integer number, name is a String)
Class Institute
id
name
Branch
id
name
Subject
id
name
Topic
id
name
SubTopic
id
name
Question
id
name*/


public class Questions {

	private int id;
	private String name;
	
	public Questions()
	{
		
	}
	public Questions(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	public void setID(int id)
	{
		this.id=id;
	}
	public int getID()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public String toString ()
	{
		return "Que. No. : "+id+"\nQuestions : "+name;
	}
	public static void main(String[] args) {
		
		Questions obj=new Questions (1,"What is Java and Its Features ?");
		System.out.println(obj);
		
	}

}
