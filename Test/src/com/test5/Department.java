package com.test5;

public class Department {

	private int deID;
	private String depName;
	
	public Department() {
		
	}

	public Department(int deID, String depName) {
		this.deID = deID;
		this.depName = depName;
	}

	public int getDeID() {
		return deID;
	}

	public void setDeID(int deID) {
		this.deID = deID;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	@Override
	public String toString() {
		return "Department [deID=" + deID + ", depName=" + depName + "]";
	}
	
	
	
}
