package com.methods;

public class Account {

	/*Create a class Account containing following methods :
		insert() to insert account data
		display() to display account information
		deposit() to deposit amount
		withdraw() to withdraw amount
		checkbalance() to check balance*/
	
	private String name;
	private String ifsc;
	private long accno;
	private double balance;
	private double withdraw;
	private double deposit;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setIfsc(String ifsc)
	{
		this.ifsc=ifsc;
	}
	public String getIfsc()
	{
		return ifsc;
	}
	public void setAccno(long ac)
	{
		accno=ac;
	}
	public long getAccno()
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
	public void setDeposit(double deposit)
	{
		System.out.println("You have deposit : "+deposit);
		this.balance=balance+deposit;
		System.out.println("Balance : "+balance);
	}
	public double getDeposit()
	{
		return deposit;
	}
	public void setWithdraw(double withdraw)
	{
		if (this.balance>=withdraw)
		{
			System.out.println("Withdraw balance : "+withdraw);
			this.balance=balance-withdraw;
			System.out.println("The Remaining balance after Withdraw is : "+balance);
		}
		else 
		{	
		System.out.println("You have a insufficient bank balance...");
		}
	}
	public double getWithdraw()
	{
		return withdraw;
	}
	public void setData(String name, String ifsc, long accno, double balance, double withdraw, double deposit)
	{
		this.name=name;
		this.ifsc=ifsc;
		this.accno=accno;
		this.balance=balance;
		this.withdraw=withdraw;
		this.deposit=deposit;
	}
	public void display()
	{
		System.out.println("Name of account holder : "+name);
		System.out.println("Acc no. : "+accno);
		System.out.println("Ifsc code : "+ifsc);
		System.out.println("Balance : "+balance);
		
	}
	
	
	public static void main(String[] args) {
		
		Account obj=new Account();
		
		obj.setName("Sudarshan");
		obj.setAccno(736273929);
		obj.setIfsc("IFSc232");
		obj.setBalance(123000);
		
		obj.display();
		obj.setWithdraw(23000);
		obj.setDeposit(25000);
	}

}
