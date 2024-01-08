package com.inheritance;

/*WAP to create class company with method address.
create class eBay which extends company implement address() differently in eBay class.
Here the method address ()has been overridden in child class*/

public class EBuy extends Company{

	public EBuy()
	{
		
	}
	@Override
	public void setaddress(String address)
	{
		super.setaddress("Pune,Maharashtra");
	}
	
	public String toString()
	{	
		return super.toString();
		
	}
	
	public static void main(String[] args) {
		
		Company obj= new EBuy();
		obj.setaddress("Mumbai,Maharashtra");
		System.out.println(obj);
		
//		EBuy obj1=new EBuy();
//		obj1.setaddress("Mumbai,Maharashtra");
//		System.out.println(obj1);
		
				
		

	}

}
