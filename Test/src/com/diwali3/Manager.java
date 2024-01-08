package com.diwali3;

public class Manager extends Employee{

	public Manager() {
		
	}
	public Manager(String name, int age, Address add, double sal, long phone,String speci, String dept) {
		
		super(name,age,add,sal,phone,speci,dept);
	}
	public String toSting() {
		
		return super.toString();
	}
	
	public static void main(String[] args) {
		
		Manager m = new Manager("Nitin", 32, new Address(423141,"Mumbai","ShriHari"), 93000, 1234567890, "Java", "Production");
		System.out.println(m);
		
	}
}
