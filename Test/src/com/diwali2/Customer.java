
package com.diwali2;

import java.util.Scanner;

/*Write Customer class with read and write properties customerId,customerName,customerAddress.
Create object of this class by taking values from user.
Class should have provision to create backup(copy) of any customer record(object). 
i)Do it by passing object as parameter to method.	                                                        
ii)  Do it without passing object as parameter to method.
iii) Customer Object should be readable ,if it is printed directly like - System.out.println(custobj) ;

*/

public class Customer {

	int customerID;
	String customerName;
	Address ad;
	
	public Customer() {
		
	}
	public Customer(int id, String name, Address s)
	{
		customerID = id;
		customerName= name;
		ad= s;
	}
	public void setData(int id, String name, Address s)
	{
		customerID = id;
		customerName= name;
		ad= s;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}
	public void CreateBackup() {
		
		System.out.println("\nBackup Copy ");
		int ID =getCustomerID();
		String name = getCustomerName();
		Address ad = getAd();
		
		System.out.println("Customer ID : "+ID);
		System.out.println("Customer Name : "+name);
		System.out.println(ad.toString());
		
	}
	public Customer createCopy(Customer obj) {
		Customer o= new Customer();
		o=obj;
		return o;	
	}
	public String toString ()
	{
		return "Customer ID : "+customerID+"\nCustomer Name : "+customerName+"\n"+ad.toString();
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("1.Readble 2.Not Readable");
		int a=sc.nextInt();
		if (a==1) {
		System.out.println("Enter Your name : ");
		String name = sc.next();
		System.out.println("Enter Your id : ");
		int id = sc.nextInt();
		System.out.println("Enter Your Apartment : ");
		String art = sc.next();
		System.out.println("Enter Your City : ");
		String city = sc.next();
		System.out.println("Enter Your Pincode : ");
		int pin = sc.nextInt();
		
		Customer cst = new Customer(id, name, new Address(pin, city, art));
		
		System.out.println(cst);
		cst.CreateBackup();
		System.out.println("---------------------------------------------------");
		cst.createCopy(cst);
		System.out.println(cst);
		}
		
		else
			System.out.println("Person is NOT readable ");
		
		
sc.close();
	}

}

class Address{
	
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

