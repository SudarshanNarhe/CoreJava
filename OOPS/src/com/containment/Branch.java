package com.containment;

public class Branch {
	
	private int id;
	private String name;
	private Questions que[];
	private Subtopic sub[];
	private Topic topic[];
	private Subject subject[];
	
	public Branch()
	{
		
	}
	public Branch(int id, String name,Questions que[], Subtopic sub[],Topic topic[],Subject subject[])
	{
		this.id=id;
		this.name=name;
		this.que=que;
		this.sub=sub;
		this.topic=topic;
		this.subject=subject;
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
	};
	public String toString()
	{
		return "Branch : "+id+"\nBranch name : "+name;
	}
	public void print()
	{	
		for(Subject b: subject)
			System.out.println(b);
		for(Topic a:topic)
			System.out.println(a);
		for(Subtopic c: sub)
			System.out.println(c);
		for(Questions d:que)
			System.out.println(d);	
	}
	
	public static void main(String[] args) {
		
		Questions que[]=new Questions[1];
		que[0]=new Questions(13,"What is Java and its Features?");
		
		Subtopic sub[]=new Subtopic[1];
		sub[0]=new Subtopic(5,"OOPS and Arrays",que);
		
		Topic topic[]= new Topic [1];
		topic[0]=new Topic(8,"Java",que,sub);
		
		Subject sub1[]=new Subject[1];
		sub1[0]=new Subject(3,"Java and Fundamentals",que,sub,topic);
		
		Branch obj=new Branch(6,"Computer Science",que,sub,topic,sub1);
		System.out.println(obj);
		obj.print();

	}

}
