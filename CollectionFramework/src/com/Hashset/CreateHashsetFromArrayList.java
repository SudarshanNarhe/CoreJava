package com.Hashset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

//  WAP to create a HashSet from an ArrayList

public class CreateHashsetFromArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> arr= new ArrayList<String>();
		arr.add("Sudarshan");
		arr.add("Utkarsha");
		arr.add("Yogesh");
		arr.add("Pavan");
		arr.add("Snehal");
		arr.add("Pavan");
		
		System.out.println("ArrayList : ");
		System.out.println(arr);
		HashSet<String> set = new HashSet<String>(arr);
		System.out.println("HashSet : ");
		System.out.println(set);
		
		System.out.println("Using Iterator : ");
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		HashSet<Integer> set1=new HashSet<Integer>();
		set1.add(10);
		set1.add(12);
		set1.add(32);
		set1.add(30);
		set1.add(12);
		set1.add(23);
		System.out.println("Using Iterator for Integer : ");
		Iterator<Integer> itr1 = set1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("Convert into Array : ");
		Integer []str= new Integer[set1.size()];
		set1.toArray(str);
		System.out.println(Arrays.toString(str));
		
		System.out.println("2nd Way : ");
		Object [] str1= set1.toArray();
		System.out.println(Arrays.toString(str1));
		
	}

}
