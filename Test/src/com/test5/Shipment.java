package com.test5;

public class Shipment {
	
	int shipid;
	String cust_name;
	Address address;
	MyDate date;
	
	public Shipment() {
		
	}

	public Shipment(int shipid, String cust_name, Address address, MyDate date) {
		super();
		this.shipid = shipid;
		this.cust_name = cust_name;
		this.address = address;
		this.date = date;
	}

	public int getShipid() {
		return shipid;
	}

	public void setShipid(int shipid) {
		this.shipid = shipid;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public MyDate getDate() {
		return date;
	}

	public void setDate(MyDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Shipment [shipid=" + shipid + ", cust_name=" + cust_name + ", address=" + address + ", date=" + date
				+ "]";
	}
	
	
}
