package com.TreeSet;

import java.util.TreeSet;

public class TreeSetMethods {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		set.add("Sudarshan");
		set.add("Utkarsha");
		set.add("Yogesh");
		set.add("Snehal");
		set.add("Aadarsh");
		set.add("Pavan");
		set.add("Ishwar");
		
		
		System.out.println(set);
		
		System.out.println("Ceiling : "+set.ceiling("Ss")); //It will show nearest upper value
		
		System.out.println("Flooring : "+set.floor("Ss"));	//It will show nearest lower value
		
		System.out.println("First : "+set.first()); //It will give 1st element of sorted set
		
		System.out.println("Higher : "+set.higher("Ulka")); //It will give higher String of given string if not it will give next
		
		System.out.println(set.pollFirst()); //It will show first and remove 
		System.out.println(set);
		System.out.println(set.pollLast());	//It will show last and remove 
		System.out.println(set);
		
		System.out.println(set.lower("Utkarsha"));
		System.out.println(set);
	
	}

}
