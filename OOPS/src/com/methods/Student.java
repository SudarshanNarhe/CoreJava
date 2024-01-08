package com.methods;

public class Student {

	/*add method displayData inside Student class change
	values of id name in that method & also print the changed
	values in same method. Call displayData method from
	main method and see the output. Observe displayData can
	only be called by creating object of Student*/
	
	
	
	/*Create getId() method in Student class. call getId() method
	from displayData method so that you know that one
	method can be called from another method. Return id
	from getId() method and set that id to the instance
	variable in displayData method.*/
	
	String name;
	int id;
	
	
	public void setData(String nam, int iid)
	{
		name=nam;
		id=iid;
	}
	
	public void displayData()
	{
		System.out.println("Name of Student : "+name);
		System.out.println("Student id : "+id);
	}
	
	public static void main(String[] args) {
		
		Student obj =new Student ();
		obj.setData("Sudarshan", 263);
		obj.displayData();
		
	}

}
