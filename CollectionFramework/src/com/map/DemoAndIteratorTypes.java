package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class DemoAndIteratorTypes {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Sudarshan");
		map.put(2, "Ishwar");
		map.put(3, "Pavan");
		map.put(4, "Bhakti");
		map.put(5, "Aadarsh");
		
		System.out.println("Map Size is : "+map.size());
		
		//Iterator using direct method...
		System.out.println(map);
		System.out.println("**************************************************************");
		
		//Using KeySet by enhanced for loop...
		for(Integer s : map.keySet()) {
			System.out.println(s+" "+map.get(s));
		}
		
		System.out.println("**************************************************************");
		
		//Using Iterator... 
		Set<Entry <Integer,String >> s =map.entrySet();
		Iterator<Entry<Integer, String>> set=s.iterator();
		while(set.hasNext()) {
			System.out.println(set.next());
		}
		
		System.out.println("**************************************************************");
		
		//Using for each...
		for(Entry<Integer, String> e : s) {
			System.out.print(e.getKey()+" ");
			System.out.println(e.getValue());
			
		}
		
		System.out.println("**************************************************************");

		//Using Values...
		Collection<String> list=map.values();
		for(String str : list) {
			System.out.println(str);
		}
		
	}

}
