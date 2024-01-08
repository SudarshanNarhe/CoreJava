package com.LinkedHashMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class BookLinkedMap {

	public static void main(String[] args) {
		
		LinkedHashMap<Book, Integer> book= new LinkedHashMap<Book, Integer>();
		book.put(new Book (12,"Shyamchi Aai",2300), 23);
		book.put(new Book(41, "Wings Of Fire", 1090), 18);
		book.put(new Book(87,"Java Coding",3200), 15);
		book.put(new Book(52, "Basics of Coding", 760), 8);
		book.put(new Book(72, "Mrutunjay", 4200), 6);
		book.put(new Book(121,"Python Learning", 3100), 10);
		
		Set<Entry<Book, Integer>> set = book.entrySet();
		Iterator<Entry<Book, Integer>> itr =set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Maximum Copies ---->>");
		itr=set.iterator();
		Collection<Integer> cls=book.values();
		Iterator<Integer> itr1 =cls.iterator();
		int max=0;
		Book b=null;
		while(itr.hasNext()) {
			Entry<Book, Integer> etr=itr.next();
			Book b1=etr.getKey();
			int a=itr1.next();
			if(a>max) {
				max=a;
				b=b1;
			}
		}
		System.out.println("Maximum Copies "+b+" is : "+max);
		
		System.out.println("Minimum Copies ---->>");
		itr=set.iterator();
		itr1=cls.iterator();
		
		ArrayList<Integer> list=new ArrayList<Integer>(book.values()); //to sort we have to convert in into arraylist first so will get the sort method
		Collections.sort(list);
		System.out.println(list.get(0));
		int min=list.get(0);	// it will sort and give minimum value 
		
		Set<Book> bk=book.keySet();
		for(Book bk1 : bk) {
			if(book.get(bk1)==min) {
				System.out.println(bk1.getName()+" has minimum copies is : "+min);
			}
		}
		
		
		
	}
	
}
