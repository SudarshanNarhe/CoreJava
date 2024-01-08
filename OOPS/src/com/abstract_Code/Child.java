package com.abstract_Code;

/* WAJP2 create an abstract class Parent. Add an abstract method cook() in it 
which has only definition and one method wash() which also has 
implementation. Create class Child which extends Parent and add the missing 
method implementation. In main, use both the methods by creating instance 
of the concrete class.
6. Show use of parameterized constructor of parent class (Child class invokes 
parent’s parameterized constructor) using super */

 abstract class Parent {
	
	String name;
	
	public Parent(String name)
	{
		this.name=name;
		
	}
	public abstract String cook();

	public  void wash()
	{
		System.out.println("Wash");
	}

}

public class Child extends Parent
{
	//String name;
	public Child (String name)
	{
		super(name);
		
	}

	@Override
	public String cook() {
		
		System.out.println("I am in Cook child ");
		return null;
	}
	public  void wash()
	{
		System.out.println("I am in Child class");
		System.out.println("Wash");
	}
	
	@Override
	public String toString() {
		return name;
	}

	public static void main(String[] args) {
		
		Child obj= new Child("Sudarshan");
		obj.cook();
		obj.wash();
		System.out.println(obj);
		
	}

	
}
