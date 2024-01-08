package com.ArrayList;

public class Employee2 implements Comparable<Employee2>{

	Integer id;
	String name;
	String designation;
	Integer age;
	Double salary;
	Department2 d;
	
	public Employee2() {
		
	}
	public Employee2(int id, String name,String designation, int age , double salary, Department2 d) {
		
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.age=age;
		this.salary=salary;
		this.d=d;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Department2 getD() {
		return d;
	}
	public void setD(Department2 d) {
		this.d = d;
	}
	public String toString() {
		
		return "\nEmployee Id : "+id+", Employee Name : "+name+", Employee Designation : "+designation+
				", Emloyee age : "+age+", Salary : "+salary+", "+d.toString();
	}
	
	@Override
	//Ascending Order....
	public int compareTo(Employee2 o) {
		if(this.id==o.id)
		   return 0;
		else if (this.id> o.id)
			return 1;
		else 
			return -1;
	}
	
	//Descending Order...
//	public int compareTo(Employee2 o) {
//		if(this.id==o.id)
//		   return 0;
//		else if (this.id> o.id)
//			return -1;
//		else 
//			return 1;
//	}
	
	//By Built in method it only show the ascending order to make it descending we have to make a reverse of it
//	public int compareTo(Employee2 o) {
//		return this.id-o.id;
//	}

	
	
}
