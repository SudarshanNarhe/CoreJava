package com.containment;

public class Topic {

	private int id;
	private String name;
	Questions question[];
	Subtopic subtopic[];
	
	public Topic ()
	{
		
	}
	public Topic (int id, String name,Questions question[], Subtopic subtopic[] )
	{
		this.id=id;
		this.name=name;
		this.question=question;
		this.subtopic=subtopic;
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
	public void setquestions(Questions question[])
	{
		this.question=question;
	}
	public Questions []getquestions()
	{
		return question;
	}
	public void setSubtopic (Subtopic subtopic [])
	{
		this.subtopic=subtopic;
	}
	public Subtopic[] getSubtopic()
	{
		return subtopic;
	}
	public String toString ()
	{
		return "Topic : "+id+"\n"+"Topic name : "+name;
	}
	public void print()
	{
		for(Subtopic stp:subtopic)
			System.out.println(stp);
		for(Questions que:question)
			System.out.println(que);
		
	}
	
	public static void main(String[] args) {
		Questions que[]=new Questions [1];
		que[0]=new Questions(12,"What is Java and its Features?");
		
		Subtopic stp[]=new Subtopic[1];
		stp[0]=new Subtopic(5,"OOPS and Arrays",que);
		
		Questions que1[]=new Questions [1];
		que1[0]=new Questions(13,"What is Java and its Features?");
				
		Topic tpc=new Topic(8,"Java",que1,stp);
		tpc.setquestions(que1);
		System.out.println(tpc);
		tpc.print();
		
	}

}
