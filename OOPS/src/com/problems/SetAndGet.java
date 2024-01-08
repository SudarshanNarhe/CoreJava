package com.problems;

public class SetAndGet {

	private int rollno;
	private String name, mail;
	private double totalmarks;
	
	public void setRollno(int roll)
	{
		rollno=roll;
	}
	public int getRollno()
	{
		return rollno;
	}
	public void setName(String nam)
	{
		name=nam;
	}
	public String getName()
	{
		return name;
	}
	public void setMail(String mail1)
	{
		mail=mail1;
	}
	public String getMail()
	{
		return mail;
	}
	public void setTotalmarks(double marks)
	{
		totalmarks=marks;
	}
	public double getTotalmarks()
	{
		return totalmarks;
	}
	public void setData(int roll,String nam,String mail1,double marks)
	{
		rollno=roll;
		name=nam;
		mail=mail1;
		totalmarks=marks;
	}
	
	public void Display()
	{
		System.out.println("Name of the Student : "+name);
		System.out.println("Roll no.: "+rollno);
		System.out.println("Email id : "+mail);
		System.out.println("Total marks : "+totalmarks);
	}
	
	public static void main(String[] args) {
		   
		SetAndGet obj=new SetAndGet();
		obj.setName("Sudarshan");
		obj.setRollno(23);
		obj.setMail("narhe@sd");
		obj.setTotalmarks(400);
		obj.Display();

	}

}
