package com.BeanClasses;

public class TestResult implements Comparable<TestResult>{
	
	private Date testDate;
	private int testID;
	private int studentID;
	private int courseID;
	private int marks;
	private int outOfMarks;
	
	public TestResult() {
		
	}

	public TestResult(Date testDate, int testID, int studentID, int courseID, int marks, int outOfMarks) {
		super();
		this.testDate = testDate;
		this.testID = testID;
		this.studentID = studentID;
		this.courseID = courseID;
		this.marks = marks;
		this.outOfMarks = outOfMarks;
	}

	public Date getTestDate() {
		return testDate;
	}

	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}

	public int getTestID() {
		return testID;
	}

	public void setTestID(int testID) {
		this.testID = testID;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getOutOfMarks() {
		return outOfMarks;
	}

	public void setOutOfMarks(int outOfMarks) {
		this.outOfMarks = outOfMarks;
	}
	@Override
	public String toString() {
		return "\ntestDate=" + testDate + ", testID=" + testID + ", studentID=" + studentID + ", courseID="
				+ courseID + ", marks=" + marks + ", outOfMarks=" + outOfMarks + "]";
	}

	@Override
	public int compareTo(TestResult o) {
		if(this.marks>o.marks)
		return -1;
		else if(this.marks<o.marks)
			return 1;
		else
			return 0;
	}
	
	
}
