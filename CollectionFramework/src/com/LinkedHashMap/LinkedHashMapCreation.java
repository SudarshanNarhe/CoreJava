package com.LinkedHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapCreation {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		//It maintain the order of insertion
		System.out.println(map);
		
		HashMap<Integer, String> hmap = new LinkedHashMap<Integer, String>();
		hmap.put(12, "Red");
		hmap.put(19, "Purple");
		hmap.put(13, "White");
		hmap.put(15, "Black");
		hmap.put(28, "Grey");
		
		LinkedHashMap<Integer, String> lmap= new LinkedHashMap<Integer, String>(hmap);
		lmap.put(73, "Blue");
		lmap.put(67,"Pink");
		
		
		Set<Entry<Integer, String>> set =lmap.entrySet();
		Iterator<Entry<Integer, String>> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//lmap.clear(); //It clear all the elements from map
		System.out.println(lmap.isEmpty());
		lmap.remove(19);
		System.out.println(lmap);
		
		Set<Integer> ss=lmap.keySet();
		Iterator<Integer> itr1 = ss.iterator();
		int max=0;
		while(itr1.hasNext()) {
			int a=itr1.next();
			if(a>max)
				max=a;
		}
		System.out.println("Highest Key is = "+max+ " : "+lmap.get(max));
		
		
		
		
		
	}

}
