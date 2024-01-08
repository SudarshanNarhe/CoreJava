package com.test5;

public class Address {
	
	String add;
	String city;
	String State;
	
	public Address() {
		
	}

	public Address(String add, String city, String state) {
		super();
		this.add = add;
		this.city = city;
		State = state;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	@Override
	public String toString() {
		return "Address [add=" + add + ", city=" + city + ", State=" + State + "]";
	}
	
}
