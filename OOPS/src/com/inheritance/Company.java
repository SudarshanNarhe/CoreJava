package com.inheritance;

/*WAP to create class company with method address.
create class eBay which extends company implement address() differently in eBay class.
Here the method address ()has been overridden in child class*/

public class Company {

	private String address;
	
	public Company()
	{

	}
	public void setaddress(String address)
	{
		this.address=address;
	}
	public String getaddress()
	{
		return address; 
	}
	
	@Override
	public String toString() {
		return "Company address=" + address ;
	}
	
//	public static void main(String[] args) {
//		
//		Company obj= new Company();
//		obj.setaddress("Pune,maharashtra");
//		System.out.println(obj);
//		
//	}

}
