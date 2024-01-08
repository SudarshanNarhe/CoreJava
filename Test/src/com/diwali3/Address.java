package com.diwali3;

public class Address{
	
	int pincode;
	String city;
	String Apartment;
	
	public Address() {
		
	}
	public Address(int code, String city, String aprt) {
		
		this.pincode=code;
		this.city=city;
		this.Apartment=aprt;
	}
	
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getApartment() {
		return Apartment;
	}
	public void setApartment(String apartment) {
		Apartment = apartment;
	}
	public String toString()
	{
		return "Apartment : "+Apartment+"\nCity : "+city+"\nPincode : "+pincode;
	}
	
}
