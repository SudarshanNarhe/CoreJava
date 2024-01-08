package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class MapAssignments {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		
		map.put(1, "Sudarshan");
		map.put(0, "Prashant");
		map.put(2, "Snehal");
		map.put(3, "Yogesh");
		
		/*
		 * WAP to get all the entries from a HashMap. Iterate the entries and print the
		 * Key & Value values
		 */
		
		Set<Entry<Integer, String>> str= map.entrySet();
		Iterator<Entry<Integer, String>> itr = str.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("************************************************");
		// WAP to get only the Keys from a HashMap
		for(Integer s : map.keySet()) {
			System.out.println(s+" "+map.get(s));
		}
		
		System.out.println("************************************************");

		// WAP to get only the Values from a HashMap
		Collection<String> cs= map.values();
		for(String str1 : cs) {
			System.out.println(str1);
		}
		System.out.println("************************************************");
		
		// WAP to copy all of the mappings from the specified HashMap to another map
		System.out.println("After Copy : ");
		HashMap<Integer, String> map1= new HashMap<Integer, String>(map);
		System.out.println(map1);
		
		System.out.println("************************************************");
		
		//WAP to search for an element from HashMap using key
		System.out.println("Search element Using key : ");
		String ele= map.get(2);
		System.out.println(ele);
		
		System.out.println("************************************************");

		//WAP to test if a HashMap contains a mapping for the specified Key and values...

		System.out.println(map.containsValue("Sudarshan"));
		Set<Integer> st =map.keySet();
		for(Integer ss : st) {
			if(ss.equals(3)) {
				System.out.println("Value is : "+map.get(ss));
			}
		}
		
		System.out.println(map.containsKey(2));
		String value="Sudarshan";
		for(Entry<Integer, String> entry : map.entrySet()) {
			if(entry.getValue()==value) {
				System.out.println("The Value for "+value+" is "+entry.getKey());
			}
		}
		System.out.println("************************************************");

		//WAP to remove an element from HashMap using key
		System.out.println("Before : "+map);
		map.remove(2);
		System.out.println("After : "+map);
		System.out.println(map.remove(1, "Sudarshan")); //It will return true because it check first and print and then remove the elements...
		System.out.println(map);
	}

}
