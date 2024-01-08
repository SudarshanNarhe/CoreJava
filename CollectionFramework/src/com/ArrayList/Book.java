package com.ArrayList;

public class Book {

	int bookID;
	String bookName;
	String bookAuthor;
	double price;
	
	public Book() {
		
	}
	public Book(int bookId, String bookName, String bookAuthor, double price) {
		
		this.bookID=bookId;
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		this.price=price;
	}
	public void setBookID(int bookId) {
		this.bookID=bookId;
	}
	public int getBookId() {
		return bookID;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookID=" + bookID + " bookName=" + bookName + " bookAuthor=" + bookAuthor + " price=" + price;
	}
	
	
}
