package com.diwali_2;

public class Account {

	private int acNo;
	private String name;
	private double balance;
	private static String bankName="State Bank Of India";
	
	public Account() {
		
	}
	public Account(int ac, String name, double bal) {
		this.acNo=ac;
		this.balance=bal;
		this.name=name;
		
	}
	public int getAcNo() {
		return acNo;
	}
	public void setAcNo(int acNo) {
		this.acNo = acNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [acNo=" + acNo + ", name=" + name + ", balance=" + balance + "Bank name : "+bankName+"]";
	}
	public static void main(String[] args) {
		
		Account obj=new Account(12,"Sudarshan", 23000);
		System.out.println(obj);
		Account obj1 =new Account(23,"Pavan",56000);
		System.out.println(obj1);
		
	}
	
}
