package com.problems;

import java.util.Scanner;

public class Account {

	private int accNo;
	private String ownerName;
	private double balance;
	
	public void setAccNo(int ac)
	{
		accNo=ac;
	}
	public int getAccNo()
	{
		return accNo;
	}
	public void setOwnerName(String name)
	{
		ownerName=name;
	}
	public String getOwnerName()
	{
		return ownerName;
	}
	public void setBalance(double bal)
	{
		balance=bal;
	}
	public double getBalance()
	{
		return balance;
	}
	
	public void setData(int ac, String nam, double bal )
	{
		accNo=ac;
		ownerName=nam;
		balance=bal;	
	}
	
	public void display()
	{
		System.out.println("Owner Name : "+ownerName);
		System.out.println("Account number : "+accNo);
		System.out.println("Balance : "+balance);
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name=sc.next();
		System.out.println("Enter your Account number : ");
		int ac=sc.nextInt();
		Account obj=new Account ();
		obj.setOwnerName(name);
		obj.setAccNo(ac);
		obj.setBalance(23000);
		obj.display();
		
		
		
sc.close();		
	}

}
