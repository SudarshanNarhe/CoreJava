package com.containment;

/* Create class Person which has attributes (name, gender, age, Address).
Address is class which has attributes (city, state, country). Display Persons
data */

public class Address {

	private String city;
	private String state;
	private String country;
	
	public Address()
	{
		
	}
	public Address(String city, String state, String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public String getCity()
	{
		return city;
	}
	public void setState(String state)
	{
		this.state=state;
	}
	public String getState()
	{
		return state;
	}
	public void setCountry(String country)
	{
		this.country=country;
	}
	public String getCountry()
	{
		return country;
	}
	public String toString()
	{
		return "City : "+city+"\nState : "+state+"\nCountry : "+country;
	}
	
	public static void main(String[] args) {
		
		Address obj=new Address("Pune","Maharashtra","India");
		System.out.println(obj);

	}

}
