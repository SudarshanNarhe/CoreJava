package com.map;

import java.util.HashMap;

public class CreateNonGenericHashmap {

	public static void main(String[] args) {
		
		/*
		 * WAP to add elements to a HashMap without using generics (ie do not use <>)
		 * and print content of it. Use Integer as Key and String as Value. In second
		 * HashMap add elements of String type as Key and Integer as Value.
		 */
		
		HashMap map = new HashMap();
		map.put(1, "Sudarshan");
		map.put(2, "Yogesh");
		map.put(3, "Prashant");
		map.put(4, "Pavan");
		
		System.out.println(map);
		
		map.put("A",12);
		map.put("B", 23);
		map.put("C", 67);
		map.put("D", 56);
		
		System.out.println(map);
		
		HashMap map1 = new HashMap();
		map1.put("A",12);
		map1.put("B", 23);
		map1.put("C", 67);
		map1.put("D", 56);
		
		System.out.println(map1);
	}

}
