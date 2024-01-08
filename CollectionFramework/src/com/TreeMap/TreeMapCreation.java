package com.TreeMap;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class TreeMapCreation {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tmap= new TreeMap<Integer, String>();
		tmap.put(12, "Sudarshan");
		tmap.put(32, "Yogesh");
		tmap.put(45, "Snehal");
		tmap.put(15, "Maruti");
		tmap.put(19, "Suraj");
		tmap.put(28, "Utkarsha");
		tmap.put(34, "Ishwar");
		
		System.out.println(tmap);
		
		
		System.out.println("In descending order ------->>>");
		NavigableSet<Integer> ni=tmap.descendingKeySet();
		System.out.println("By Navigable Set ");
		for(int i : ni) {
			System.out.println(i +" : "+tmap.get(i));
		}
		System.out.println("By Navigable map ");
		NavigableMap<Integer, String> navimap=tmap.descendingMap();
		System.out.println(navimap);
		
		//if same input and list and same key it will return same key
		// or if not same value is there then it will return greater than input 
		//if out input is greater then it will return null
		System.out.println("Ceiling key : "+tmap.ceilingKey(40));
		
		
		//It will return less than equal to key and reverse concept of ceiling key
		System.out.println("Floor key : "+tmap.floorKey(40));
		
		//its delete all the 
		//tmap.clear();
		System.out.println(tmap.isEmpty());
		
		//FirstKey
		//LastKey
		System.out.println("First Key : "+tmap.firstKey());
		System.out.println("Last Key : "+tmap.lastKey());
		
		//Higher Key
		//Lower Key
		//It will not give the same value
		System.out.println("Lower Key : "+tmap.lowerKey(23));
		System.out.println("Upper Key : "+tmap.higherKey(40));
		
		//Floor Entry
		//Ceiling Entry
		System.out.println("Floor Entry : "+tmap.floorEntry(40));
		System.out.println("Ceiling Entry : "+tmap.ceilingEntry(23));
		
		//LowerEntry
		//Higher Entry
		System.out.println("Lower Entry : "+tmap.lowerEntry(23));
		System.out.println("Higher Entry : "+tmap.higherEntry(40));
		
		//Last Entry
		System.out.println("Last Entry : "+tmap.lastEntry());
		
		System.out.println("New Map------------------------>>>>>>>>>");
		
		TreeMap <Integer,String> tm=new TreeMap<>(Collections.reverseOrder());
		tm.put(42, "Pune");
		tm.put(43, "Patna");
		tm.put(23, "Paris");
		tm.put(10, "Mumbai");
		tm.put(98, "Surat");
		tm.put(78, "Chennai");
		
		System.out.println(tm);
		
		//Search using key as a input..
		System.out.println("Search by using input ");
		NavigableSet<Integer> nset=tm.navigableKeySet();
		for(int i : nset) {
			if(i==23) {
				System.out.println(i +" : "+ tm.get(i));
			}
		}
		
	}

}
