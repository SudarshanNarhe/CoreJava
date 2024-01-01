package com.BeanClasses;

public class Transaction {

	private int paidFees;  //It is for to maintain the installments for every Entry for Student
	private int studentID;
	private Date trans_Date;
	
	public Transaction() {
		
	}

	public Transaction(int studentID,int paidFees,  Date trans_Date) {
		super();
		this.paidFees = paidFees;
		this.studentID = studentID;
		this.trans_Date = trans_Date;
	}

	public int getPaidFees() {
		return paidFees;
	}

	public void setPaidFees(int paidFees) {
		this.paidFees = paidFees;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public Date getTrans_Date() {
		return trans_Date;
	}

	public void setTrans_Date(Date trans_Date) {
		this.trans_Date = trans_Date;
	}

	@Override
	public String toString() {
		return "\nStudentID=" + studentID +" , paidFees=" + paidFees + ", trans_Date=" + trans_Date + "]";
	}
	

}
