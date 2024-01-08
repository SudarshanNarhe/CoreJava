package com.Hashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetCreation {

	public static void main(String[] args) {
		// add elements using LinkedHashSet
				LinkedHashSet<String> lstr= new LinkedHashSet<String>();
				lstr.add("Pavan");
				lstr.add("Sudarshan");
				lstr.add("Utkarsha");
				lstr.add("Ishwar");
				lstr.add("Snehal");
				lstr.add("Yogesh");
				System.out.println("It maintain the order of insertion : ");
				System.out.println(lstr);
				
				System.out.println("Using Iterator : ");
				Iterator<String> itr= lstr.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
				
				//lstr.clear();
				System.out.println(lstr.isEmpty());
				
				lstr.remove("Ishwar");
				System.out.println(lstr);
				
				System.out.println(lstr.size());

	}

}
