package com.containment;

public class Account {

	private int accno;
	private double balance;
	private String name;
	
	Account ()
	{
		
	}
	Account (int ac, double balance, String name)
	{
		this.accno=ac;
		this.balance=balance;
		this.name=name;
	}
	public void setAcc(int ac)
	{
		accno=ac;
	}
	public int getAcc()
	{
		return accno;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public String toString ()
	{
		return "Account no. : "+accno+" \nAccount holder name : "+name+" \nBalance : "+balance;
	}
	
	public static void main(String[] args) {
	
		Account obj=new Account ();
		System.err.println(obj);
		Account obj1=new Account (123,35000,"Sudarshan");
		System.out.println(obj1);
//		obj.setAcc(4561);
//		obj.setBalance(45000);
//		obj.setName("Nitin");
//		System.out.println(obj);

	}

}
