package com.problems;

public class Anonymous {

	String name;
	public void setData(String nam)
	{
		name=nam;
	}
	public void display()
	{
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		Anonymous obj=new Anonymous();
		obj.setData("Rushi");
		obj.display();
		obj.setData("Ketan");
		obj.display();

	}

}
