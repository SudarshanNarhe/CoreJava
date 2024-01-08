package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class EmptyMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map= new HashMap<String, Integer>();
		map.put("A", 12);
		map.put("B", 23);
		map.put("C", 56);
		map.put("D", 89);
		map.put("E", 17);
		map.put("F", 90);
		
		System.out.println("Before remove"+map);
		//WAP to empty Map. (Hint - Get keys and iterate through the keys to remove entries from Map)
		Set<String> st=map.keySet();
		Iterator<String> itr= st.iterator();
		while(itr.hasNext()) {
			itr.next();
			itr.remove();
		}
		System.out.println("After Remove : "+map);
		
	}

}
