package com.ArrayList;

public class Department2 {

	String depname;
	int depId;
	String location;
	
	public Department2() {
		
	}
	public Department2(String name, int id, String location) {
		this.depname=name;
		depId=id;
		this.location=location;
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
	public void setLocation(String location) {
		this.location=location;
	}
	public String getLocation() {
		return location;
	}
	public String toString() {
		return "Department Id : "+depId+", Department Name : "+depname+", Location : "+location;
	}
}