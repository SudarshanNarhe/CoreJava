package com.inheritance;

// Covariant Demo

public class Parent {

	public Parent()
	{
		
	}
	public Parent getObject() {
		
		System.out.println("I am in null return of parent class");
		return null;
	}
	public Parent getObejct()
	{
		System.out.println("I am in Parent class");
		return new Parent();
	}

	public static void main(String[] args) 
	{
		Child c= new Child();
		c.getObejct();
		c.showChild();
		Parent p = c.getObejct();
		((Child)p).showChild();
		

	}
}
class Child extends Parent
{
	// Parent p = new Child;
	@Override
	public Parent getObject()
	{
		return new Child();
	}
	public void showChild()
	{
		System.out.println("I am in showchild() of child class");
	}
	
}
