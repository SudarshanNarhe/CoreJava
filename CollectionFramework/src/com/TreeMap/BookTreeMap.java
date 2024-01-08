package com.TreeMap;

import java.util.TreeMap;

public class BookTreeMap {

	public static void main(String[] args) {
		
		TreeMap<Book, Integer> book=new TreeMap<Book, Integer>();
		book.put(new Book(21, "Java", 800), 60);
		book.put(new Book (12,"Shyamchi Aai",2300), 23);
		book.put(new Book(41, "Wings Of Fire", 1090), 18);
		book.put(new Book(87,"Java Coding",3200), 15);
		book.put(new Book(52, "Basics of Coding", 760), 8);
		book.put(new Book(72, "Mrutunjay", 4200), 6);
		book.put(new Book(121,"Python Learning", 3100), 10);
		
		System.out.println(book);

	}

}
