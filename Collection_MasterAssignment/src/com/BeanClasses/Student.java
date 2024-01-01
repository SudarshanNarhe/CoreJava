package com.BeanClasses;

public class Student {
	
	private int studentID;
	private String studentName;
	private long phoneNo;
	private String mail;
	
	public Student() {
		
	}

	public Student(int studentID, String studentName, long phoneNo, String mail) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.phoneNo = phoneNo;
		this.mail = mail;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "\nstudentID=" + studentID + ", studentName=" + studentName + ", phoneNo=" + phoneNo + ", mail=" + mail + "]";
	}
	

}
