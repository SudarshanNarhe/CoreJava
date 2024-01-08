package com.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<String>();
		
		System.out.println(name.size());
		name.add("Sudarshan");
		name.add("Ishawar");
		name.add("Yogesh");
		name.add("Aadarsh");
		
		System.out.println(name.size());
		System.out.println(name);
		
		name.add(1, "Suraj");
		System.out.println(name);
		
		name.remove(2);
		System.out.println(name);
		boolean f = name.remove("Suraj");
		System.out.println(f);
		System.out.println(name);
		
		ArrayList<String>sub = new ArrayList<String>();
		sub.add("Math");
		sub.add("Phy");
		sub.add("Bio");
		sub.add("Chem");
		System.out.println(sub);
		
		name.addAll(sub);
		System.out.println(name);
		
		name.addAll(2, sub);
		System.out.println(name);
		
		System.out.println(name.size());
		System.out.println(sub.size());
	}

}
