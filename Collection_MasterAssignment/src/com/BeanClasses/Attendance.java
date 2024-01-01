package com.BeanClasses;

public class Attendance {
	
	private int srno;
	private int studentid;
	private String status;
	private Date date;
	
	public Attendance() {
		
	}

	public Attendance(int srno, int studentid, String status, Date date) {
		super();
		this.srno = srno;
		this.studentid = studentid;
		this.status = status;
		this.date = date;
	}

	public int getSrno() {
		return srno;
	}

	public void setSrno(int srno) {
		this.srno = srno;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String isStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "\nsrno=" + srno + ", studentid=" + studentid + ", status=" + status + ", date=" + date + "]";
	}
	
	
	
}
