package com.containment;

public class Subject {

	private int id;
	private String name;
	private Questions que[];
	private Subtopic sub[];
	private Topic topic[];
	
	public Subject()
	{
		
	}
	public Subject(int id, String name,Questions que[], Subtopic sub[], Topic topic[] )
	{
		this.id=id;
		this.name=name;
		this.que=que;
		this.sub=sub;
		this.topic=topic;
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
	public void setQuestion(Questions que[])
	{
		this.que=que;
	}
	public Questions []setquestion()
	{
		return que;
	}
	public void setSubttopic(Subtopic sub[])
	{
		this.sub=sub;
	}
	public Subtopic []getSubtopic()
	{
		return sub;
	}
	public void setTopic (Topic topic[])
	{
		this.topic=topic;
	}
	public Topic[] getTopic()
	{
		return topic;
	}
	public String toString()
	{
		return "Subject : "+id+"\nSubject name : "+name;
	}
	public void print()
	{	
		for(Topic topic:topic)
			System.out.println(topic);	
		for(Subtopic sub:sub)
			System.out.println(sub);	
		for(Questions que:que)
		System.out.println(que);	
		
	}
	
	
	
	public static void main(String[] args) {
		
		Questions que[]=new Questions[1];
		que[0]=new Questions(13,"What is Java and its Features?");
		
		Subtopic sub[]=new Subtopic[1];
		sub[0]=new Subtopic(5,"OOPS and Arrays",que);
		
		Topic topic[]= new Topic [1];
		topic[0]=new Topic(8,"Java",que,sub);
		
		Subject sub1 =new Subject(3,"Java and Fundamentals",que,sub,topic);
		System.out.println(sub1);
		sub1.print();
	}

}
