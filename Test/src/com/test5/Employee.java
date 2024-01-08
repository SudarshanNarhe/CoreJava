package com.test5;

public class Employee {

	private int eid;
	private String eName;
	private Department d;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int eid, String eName, Department d) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.d = d;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String geteName() {
		return eName;
	}


	public void seteName(String eName) {
		this.eName = eName;
	}


	public Department getD() {
		return d;
	}


	public void setD(Department d) {
		this.d = d;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + ", d=" + d + "]";
	}
	
	
	
}
