package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(12);
		arr.add(45);
		arr.add(32);
		arr.add(67);
		arr.add(89);
		arr.add(92);
		
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		arr1.add(11);
		arr1.add(12);
		arr1.add(32);
		arr1.add(67);
		arr1.add(89);
		arr1.add(31);
		
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		arr2.add(98);
		arr2.add(13);
		arr2.add(54);
		arr2.add(80);
		arr2.add(43);
		arr2.add(69);
		
		HashMap<String, ArrayList<Integer>> map= new HashMap<String, ArrayList<Integer>>();
		map.put("S",arr);
		map.put("A", arr1);
		map.put("D", arr2);
		
		Set<Entry<String, ArrayList<Integer>>> setarray= map.entrySet();
		Iterator<Entry<String, ArrayList<Integer>>> itr = setarray.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
	
}
