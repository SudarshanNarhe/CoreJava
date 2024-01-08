package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class AuthorWiseBookList {

	public static void main(String[] args) {
		
		ArrayList<Book> b= new ArrayList<Book>();
		b.add(new Book(101,"Java","James Gosling",4500));
		b.add(new Book(201,"Food Production","Parvindar BAli",6500));
		b.add(new Book(302,"Mission 2021","Dr.A.P.J. Kalam",2300));
		b.add(new Book(408,"Wings Of Fire","Dr.A.P.J. Kalam",3400));
		b.add(new Book(503,"Motivation","Dr.A.P.J. Kalam",4300));
		b.add(new Book(708,"Mrutunjay","Shivaji Sawant",8300));
		
		Iterator<Book> itr = b.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----------------------------------------------------------------------");
		
		for(int i=0;i<b.size();i++) {
			int count=0;
			for(int j=0;j<b.size();j++) {
				
				if(b.get(i).bookAuthor.equals(b.get(j).bookAuthor)&&j<i) {
					break;
				}
				else if(b.get(i).bookAuthor.equals(b.get(j).bookAuthor)){
					count++;
				}
				
			}
			if(count>0)
			System.out.println(b.get(i).bookAuthor +" has Books : "+count);
		}
		
	}

}
