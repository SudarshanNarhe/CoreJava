package com.TreeMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class SubMapDemo {

	public static void main(String[] args) {
		
				TreeMap<Integer, String> tmap= new TreeMap<Integer, String>();
				tmap.put(12, "Sudarshan");
				tmap.put(32, "Yogesh");
				tmap.put(45, "Snehal");
				tmap.put(15, "Maruti");
				tmap.put(19, "Suraj");
				tmap.put(28, "Utkarsha");
				tmap.put(34, "Ishwar");
		
				//By SubMap
				SortedMap<Integer, String>submap=tmap.subMap(23, 43);
				System.out.println("Sub Map : "+submap);

	}

}
