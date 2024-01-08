package com.containment;

public class BankArrayDemo {

	private int branchcode;
	private String bankname;
	private String address;
	Account account[];
	
	public BankArrayDemo()
	{
		
	}
	public BankArrayDemo(int branchcode, String bankname, String address, Account account [])
	{
		this.branchcode=branchcode;
		this.bankname=bankname;
		this.address=address;
		this.account=account;
	}
	public void setBranchcode(int branchcode)
	{
		this.branchcode=branchcode;
	}
	public int getBranchcode()
	{
		return branchcode;
	}
	public void setBankname(String bankname)
	{
		this.bankname=bankname;
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
	public void setAccount (Account ac[])
	{
		this.account=ac;
	}
	public Account[] getAccount ()
	{
		return account;
	}
	public String toString ()
	{
		return "Bank name: "+bankname+"\n Address : "+address+"\n Branchcode : "+branchcode;
	}
	public void printAccount()
	{
		for(Account a:account )
			System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		
		Account arr[]=new Account [4];
		arr[0]=new Account(637, 84448, "Pavan");
		arr[1]=new Account(231, 62832, "Sumit");
		arr[2]= new Account(121, 66822, "Sudarshan");
		arr[3]=new Account(523, 32771, "Aadarsh");
		
		
		BankArrayDemo obj=new BankArrayDemo(968,"State bank of India","Pune, Maharashtra",arr);
		System.out.println(obj);
		obj.printAccount();

	}

}
