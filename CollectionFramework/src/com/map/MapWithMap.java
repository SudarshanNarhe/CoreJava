package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

//WAP to create a Map which stores another Map as a value.
//WAP to iterate the elements in the Map stored in the above Map

public class MapWithMap {

	public static void main(String[] args) {
	
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		map.put(12, "SS");
		map.put(13, "AA");
		map.put(14, "RR");
		map.put(15, "KK");
		map.put(16, "PP");
		map.put(17, "NN");
		
		HashMap<Integer, String>dmap = new HashMap<Integer, String>(map);
		
		for(Integer s : dmap.keySet()) {
			System.out.println(s+" : "+dmap.get(s));
		}
		
		Collection<String> str	=dmap.values();
		for(String st : str) {
			System.out.println(st);
		}
		Set<Integer> tr=dmap.keySet();
		for(Integer ss : tr) {
			System.out.println(ss+" : "+dmap.get(ss));
		}
		
		Set<Entry<Integer, String>> s =map.entrySet();
		for(Entry<Integer, String> y : s) {
			System.out.print(y.getKey()+" ");
			System.out.println(y.getValue());
		}
		
		for(Entry<Integer,String>ob : map.entrySet()) {
			System.out.print(ob.getKey()+" ");
			System.out.println(ob.getValue());
		}
	}

}
