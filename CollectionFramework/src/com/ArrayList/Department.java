package com.ArrayList;

public class Department {

	String depname;
	int depId;
	
	public Department() {
		
	}
	public Department(String name, int id) {
		this.depname=name;
		depId=id;
	}
	public void setDeptName(String name) {
		this.depname=name;
	}
	public String getDeptName() {
		return depname;
	}
	public void setDepID(int id) {
	    this.depId=id;
	}
	public int getID() {
		return depId;
	}
	public String toString() {
		return "Department Id : "+depId+"\nDepartment Name : "+depname;
	}
}
