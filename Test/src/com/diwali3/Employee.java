package com.diwali3;

/*Two classes 'Employee' and 'Manager' inherits the 'Member' class. 
The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. 
Now, assign name, age, phone number, address and salary to an employee and a manager 
by making an object of both of these classes and print the same.
*/

public class Employee extends Member {

	String specialization;
	String department;
	
	public Employee() {
		
	}
	public Employee(String name, int age, Address add, double sal, long phone,String speci, String dept) {
		super(name,age,add,sal,phone);
		this.specialization=speci;
		this.department=dept;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return super.toString()+"\nEmployee specialization : " + specialization + "\ndepartment : " + department;
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee("Sudarshan",23,new Address(321234,"Pune","Mauli"),45000,1232432456,"Developer","R&D");
		System.out.println(e);
		
	}
	
}
