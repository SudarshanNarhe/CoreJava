package com.Hashset;

import java.util.HashSet;

public class EmptyHashSet {

	public static void main(String[] args) {
		
		HashSet<String> str= new HashSet<String>();
		str.add("Sudarshan");
		str.add("Yogesh");
		str.add("Utkarsha");
		str.add("Snehal");
		str.add("Abhishek");
		System.out.println(str);
		str.clear();
		System.out.println(str.isEmpty());
		
		
	}

}
