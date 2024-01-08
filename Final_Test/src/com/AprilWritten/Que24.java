package com.AprilWritten;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//24)WAP to access private Method  using Reflection.[1M]

class Employee{
	
	private int id;
	private String name;
	private double salary;
	
	public Employee() {
		
		
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@SuppressWarnings("unused")
	private void display() {
		System.out.println("Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]");
	}
		
};

public class Que24 {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
		
		
		Employee e1 = new Employee(101, "Sudarshan", 34000);
		
		Class<?> cl=Employee.class;
		Method m=cl.getDeclaredMethod("display");	
		m.setAccessible(true);
		m.invoke(e1);
		
		
	}
	
	
}
