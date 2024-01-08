package com.containment;

public class Institude {
	
	private int id;
	private String name;
	private Questions que[];
	private Subtopic sub[];
	private Topic topic [];
	private Subject subject[];
	private Branch branch[];
	
	public Institude ()
	{
		
	}
	public Institude(int id, String name, Questions que[],Subtopic sub[],Topic topic[],Subject subject[],Branch branch[])
	{
		this.id=id;
		this.name=name;
		this.que=que;
		this.sub=sub;
		this.topic=topic;
		this.subject=subject;
		this.branch=branch;
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
	public Questions[] getQuestion()
	{
		return que;
	}
	public void setSubtopic(Subtopic sub[])
	{
		this.sub=sub;
	}
	public Subtopic []getSubtopic()
	{
		return sub;
	}
	public void setSubject(Subject subject[])
	{
		this.subject=subject;
	}
	public Subject[]getSubject()
	{
		return subject;
	}
	public void setBranch(Branch branch[])
	{
		this.branch=branch;
	}
	public Branch[]getBranch()
	{
		return branch;
	}
	public String toString()
	{
		return "Institude ID : "+id+"\nInstitude name : "+name;
	}
	public void print()
	{
		for(Branch a:branch)
			System.out.println(a);
		for(Subject b:subject)
			System.out.println(b);
		for(Topic c:topic)
			System.out.println(c);
		for(int i=0;i<sub.length;i++)
			System.out.println(sub[i]);
		for(int i=0;i<que.length;i++)
			System.out.println(que[i]);	
	}
	
	public static void main(String[] args) {
		
		Questions que[]=new Questions[1];
		que[0]=new Questions(13,"What is Java and its Features?");
		
		Subtopic sub[]= new Subtopic[1];
		sub[0]=new Subtopic(5,"OOPS and Arrays",que);
		
		Topic topic[]=new Topic[1];
		topic[0]=new Topic(8,"Java",que,sub);
		
		Subject subject[]=new Subject[1];
		subject[0]=new Subject(3,"Java and Fundamentals",que,sub,topic);
		
		Branch branch[]=new Branch[1];
		branch[0]=new Branch(6,"Computer Science",que,sub,topic,subject);
		
		Institude inst=new Institude(2,"New Arts and Science",que,sub,topic,subject,branch);
		System.out.println(inst);
		inst.print();
		
	}

}
