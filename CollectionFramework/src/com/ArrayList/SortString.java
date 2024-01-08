package com.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortString {

	public static void main(String[] args) {
		
		ArrayList<String> str= new ArrayList<String>();
		str.add("Yogesh");
		str.add("ishwar");
		str.add("SUDARSHAN");
		
		Iterator<String >itr = str.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Collections.sort(str);
		System.out.println(str);
	}

}
