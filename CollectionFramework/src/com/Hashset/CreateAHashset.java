package com.Hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CreateAHashset {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr= new ArrayList<Integer>();
		arr.add(10);
		arr.add(23);
		arr.add(32);
		arr.add(89);
		arr.add(21);
		arr.add(23);
		System.out.println("Arraylist : ");
		System.out.println(arr);
		
		//Creating hashSet using another list
		HashSet<Integer> set= new HashSet<Integer>(arr);
		System.out.println("HashSet : ");
		System.out.println(set);
		
		System.out.println("Different Methods : ");
		HashSet<String> str= new HashSet<String>();
		str.add("Sudarshan");
		str.add("Yogesh");
		str.add("Utkarsha");
		str.add("Snehal");
		str.add("Abhishek");
		str.add("Pavan");
		str.add("Snehal");
		
		Iterator<String> itr =str.iterator();
		System.out.println("Use of iterator : ");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//str.clear();
		System.out.println(str.isEmpty());
		
		System.out.println("Size is : "+str.size());
		
		HashSet<String> str1= new HashSet<String>();
		str1.add("Yogesh");
		str1.add("Snehal");
		str1.add("Abhishek");
		
		str.removeAll(str1);
		System.out.println("After remove all method : "+str);
			
		str.remove("Pavan");
		System.out.println("After remove single object : "+str);
	}

}
