package com.test6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class DivisibleBy3InHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(7, "Seven");
		map.put(8, "Eight");
		map.put(9, "Nine");
		map.put(10, "Ten");
		
		Iterator<Entry<Integer, String>> entry = map.entrySet().iterator();
		System.out.println("After remove which is divisible by 3 are : ");
		while(entry.hasNext()) {
			Entry<Integer, String> set =entry.next();
			int a= set.getKey();
			if(a%3==0) {
				entry.remove();
			}
			else
				System.out.println(set);
		}

	}

}
