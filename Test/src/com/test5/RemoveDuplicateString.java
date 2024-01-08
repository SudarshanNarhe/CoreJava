package com.test5;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		
		ArrayList<String> arr= new ArrayList<String>();
		arr.add("Sun");
		arr.add("Mon");
		arr.add("Sat");
		arr.add("Sun");
		arr.add("Mon");
		arr.add("Sat");
		arr.add("Sun");
		arr.add("Sat");
		arr.add("Sun");
		arr.add("Mon");
		
		System.out.println(arr);
		ArrayList<String> arr1 = new ArrayList<String>();
		Iterator<String> itr= arr.iterator();
		while(itr.hasNext()) {
			String str=itr.next();
			if(!arr1.contains(str))
				arr1.add(str);	
		}
		System.out.println(arr1);
		
	}
	
}
