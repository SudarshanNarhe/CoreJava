package com.Hashset;

import java.util.HashSet;
import java.util.TreeMap;

public class CreateTreeSetFromHashSet {

	public static void main(String[] args) {
		
		 ///WAP to create a TreeSet from a HashSet.
		
		HashSet<String> str= new HashSet<String>();
		str.add("Sudarshan");
		str.add("Utkarsha");
		str.add("Snehal");
		
		System.out.println("Str : "+str);
		HashSet<String> str1= new HashSet<String>();
		str1.add("Aadarsh");
		str1.add("Pavan");
		str1.add("Suraj");
		System.out.println("Str1 : "+str1);
		
		TreeMap<Integer, HashSet<String>> tstr= new TreeMap<Integer, HashSet<String>>();
		tstr.put(1, str);
		tstr.put(2, str1);
		
		System.out.println("TreeMap : "+tstr);
	}

}
