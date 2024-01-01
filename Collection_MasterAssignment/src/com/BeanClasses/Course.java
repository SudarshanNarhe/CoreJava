package com.BeanClasses;

public class Course{
	
	private int courseid;
	private String courseName;
	private Date startDate;
	private String subject;
	private double fees;
	private String duration;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(int courseid, String courseName, Date startDate, String subject, double fees, String duration) {
		super();
		this.courseid = courseid;
		this.courseName = courseName;
		this.startDate = startDate;
		this.subject = subject;
		this.fees = fees;
		this.duration = duration;
	}

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", courseName=" + courseName + ", startDate=" + startDate + ", subject="
				+ subject + ", fees=" + fees + ", duration=" + duration + "]";
	}

	
	
	
	
}
