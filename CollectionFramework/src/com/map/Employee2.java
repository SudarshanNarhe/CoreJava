package com.map;

public class Employee2 {

	private int id, depId;
	private String eName;
	private double salary;
	
	public Employee2() {
		
	}

	public Employee2(int id, int depId, String eName, double salary) {
		this.id = id;
		this.depId = depId;
		this.eName = eName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee Id : " + id + " , Department Id=" + depId + " , Employee Name : " + eName + " , salary : " + salary;
	}
	
	
	
	
}
