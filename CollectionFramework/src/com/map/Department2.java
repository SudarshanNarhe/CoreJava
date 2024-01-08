package com.map;

public class Department2 {

	private int depID;
	private String depName, Location;
	
	public Department2(){
		
	}

	public Department2(int depID, String depName, String location) {
		this.depID = depID;
		this.depName = depName;
		Location = location;
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
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}
	@Override
	public String toString() {
		return "Department Id : " + depID + " , Departement Name : " + depName + " , Location : " + Location;
	}

	@Override
	public int hashCode() {
		
		return depID;
	}

	@Override
	public boolean equals(Object obj) {
		Department2 d= (Department2) obj;
		if(this.depID==d.depID) {
			System.out.println("This : "+this);
			System.out.println("d. : "+d.depID);
		return true;
		}
		else
			return false;
	}
	
	
}
