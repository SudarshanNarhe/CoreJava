package com.clone;

//We have to implements class by Cloneable otherwise it will show runtime error... 
public class Employee implements Cloneable{

	public int id;
	public double salary;
	public String name;
	
	public Employee() {
		
	}
	
	public Employee(int id, double salary, String name) {
		
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}

	// we have to add throws or try catch method for cloning...
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee e = new Employee(102,45000,"Ishawar");
		Employee e2 = (Employee) e.clone();
		
		System.out.println("Original \n"+e);
		System.out.println("After Clone \n"+e2);   
		

	}

}
