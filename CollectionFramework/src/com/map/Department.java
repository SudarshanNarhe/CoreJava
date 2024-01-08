package com.map;

public class Department {

	int depID;
	String depName;
	String location;
	
	public Department() {
		
	}
	public Department(int depID, String depName, String location) {
		this.depID=depID;
		this.depName=depName;
		this.location=location;
		
	}
	public int getDepID() {
		return depID;
	}
	public void setDepID(int depID) {
		this.depID = depID;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department [depID=" + depID + ", depName=" + depName + ", location=" + location + "]";
	}
	
	
}
