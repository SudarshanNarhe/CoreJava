package com.CollectionAssignments;

import java.util.Iterator;
import java.util.TreeSet;

public class OutputOfTreeSet {

	public static void main(String[] args) {
		
		// What will be output of following program.
		TreeSet map = new TreeSet();
		map.add("C");
		map.add("Java");
		map.add("Collection");
		map.add("Angular JS");
		map.add("JQuery");
		
		Iterator itr = map.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
