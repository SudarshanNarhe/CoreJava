package com.diwali3;

public class Member {

	String name;
	int age;
	Address address;
	double salary;
	long phoneNumber;
	
	public Member() {
		
	}
	public Member(String name, int age, Address add, double sal, long phone) {
		
		this.address=add;
		this.age= age;
		this.name=name;
		this.phoneNumber=phone;
		this.salary=sal;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void printSalary() {
		
		System.out.println("Salary is : "+salary);
	}
	public String toString (){
		
		return "Name : "+name+"\nAge : "+age+"\nAddress \n"+address+"\nPhone Number : "+phoneNumber+"\nSalary : "+salary;
	}
	
	
	
}
