package com.LinkedHashMap;

public class Book {

	private int id;
	private String name;
	private double price;
	
	public Book() {
		
	}

	public Book(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book id : " + id + " , Book name : " + name + ", Price : " + price ;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		Book b =(Book) obj;
		if(this.id==b.id) 
			return true;
		else
			return false;
	}
	
	
}
