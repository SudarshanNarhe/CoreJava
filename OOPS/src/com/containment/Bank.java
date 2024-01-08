package com.containment;

public class Bank {

	private String bankname;
	private String address;
	private String ifsc;
	private Account account;
	
	Bank()
	{
		bankname="";
		address="";
		ifsc="";
		account =new Account ();
				
	}
	Bank(String bank, String address, String ifsc, Account ac)
	{
		this.bankname=bank;
		this.address=address;
		this.ifsc=ifsc;
		account=ac;
				
	}
	public void setBankname(String name)
	{
		bankname=name;
	}
	public String getBankname()
	{
		return bankname;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return address;
	}
	public void setIfsc(String ifsc)
	{
		this.ifsc=ifsc;
	}
	public String getIfsc()
	{
		return ifsc;
	}
	public void setAccount (Account ac)
	{
		account =ac;
	}
	public Account getAccount ()
	{
		return account;
	}
	public String toString()
	{
		return "Bank name : "+bankname+"\n Address of Bank : "+address+" \nIfsc code : "+ifsc+" \nAcoount holder details : "+account;
	}
	
	public static void main(String[] args) {
		
		Bank obj=new Bank ();
		System.err.println(obj);
		Account ac=new Account (512,123000,"Sudarshan");
		Bank obj1=new Bank("SBI","Pune, Maharashtra","Sbi324",ac);
		System.out.println(obj1);

	}

}
