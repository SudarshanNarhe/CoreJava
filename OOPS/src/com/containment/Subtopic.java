package com.containment;

public class Subtopic {

	private int id;
	private String name;
	private Questions questions[];
	
	public Subtopic ()
	{

	}
	public Subtopic (int id, String name, Questions question[])
	{
		this.id=id;
		this.name=name;
		this.questions=question;
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
	public void setQuestion(Questions question[])
	{
		this.questions=question;
	}
	public Questions[] getQuestion()
	{
		return questions;
	}
	public String toString()
	{
		return "Subtopic : "+id+"\nSubtopic name : "+name;
	}
	public void print()
	{
		for(Questions b :questions)
		{
			System.out.println(b);
		}
	}
	
	
	public static void main(String[] args) {
		
		Questions qrr[]=new Questions[1];
		qrr[0]=new Questions(12, "What is Java and its features?");
		Subtopic sub=new Subtopic (5,"OOPS and Arrays",qrr);
		System.out.println(sub);
		sub.print();

	}

}
