package com.map;

import java.util.HashMap;

public class MapCreation {

	public static void main(String[] args) {
		
//		HashMap<Integer, String> mm= new HashMap<Integer, String>(); // default arguments
//		HashMap<Integer, String> mm1= new HashMap<Integer, String>(20); // Map With initial Capacity
//		HashMap<Integer, String> mm2= new HashMap<Integer, String>(mm1); //Creating Using Another map
//		HashMap<Integer, String> mm3= new HashMap<Integer, String>(10,1.5f); //Creating Using initial capacity and LoadFactor
		
		HashMap<Integer, String> hmap= new HashMap<Integer, String>();
		hmap.put(1, "SS");
		hmap.put(2, "AA");
		hmap.put(3, "RR");
		
		System.out.println(hmap);
		System.out.println(hmap.put(1,"KK")); //In this part it will only replace the value of particular index and print the old values.
		System.out.println(hmap); // at that time it will print the value which is replace at above line
		System.out.println("Calling get : ");
		System.out.println(hmap.get(3)); // it will return the value for particular key
		System.out.println(hmap.get(5)); //There is not any value assign to a particular so it will return null value
		hmap.put(5, "JJ");
		System.out.println(hmap.get(5)); //Now it will return a value for the given index
		System.out.println(hmap.get(4));
		
	}

}


