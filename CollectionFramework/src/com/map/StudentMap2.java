package com.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * WAP to create a ArrayList Student which contain rollno,name,arrayList marks,percentage ,
 * grade.
From 
Above arrayList of student , create a Map which having key as a grade and value is ArrayList<Student> 
 * */


public class StudentMap2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> marks1= new ArrayList<Integer>(Arrays.asList(89,67,98,74,85));
		Student2 std1= new Student2(11,"Sudarshan",marks1);
		System.out.println(std1);
		ArrayList<Integer> marks2 = new ArrayList<Integer>(Arrays.asList(86,83,56,45,91));
		Student2 std2= new Student2(12, "Utkarsh", marks2);
		System.out.println(std2);
		ArrayList<Integer> marks3 = new ArrayList<Integer>(Arrays.asList(34,56,62,55,43));
		Student2 std3 = new Student2(13, "Yogesh", marks3);
		System.out.println(std3);	
		ArrayList<Integer> marks4 = new ArrayList<Integer>(Arrays.asList(56,84,41,38,40));
		Student2 std4= new Student2(14,"Snehal",marks4);
		System.out.println(std4);
		ArrayList<Integer> marks5 = new ArrayList<Integer>(Arrays.asList(34,42,23,41,23));
		Student2 std5= new Student2(15,"Suraj",marks5);
		System.out.println(std5);
		ArrayList<Integer> marks6 = new ArrayList<Integer>(Arrays.asList(90,93,89,95,91));
		Student2 std6 = new Student2(16, "Ulka", marks6);
		System.out.println(std6);
		System.out.println("-------------------------------------------------------------------------------");
		ArrayList<Student2> stds = new ArrayList<Student2>();
		stds.add(std1);
		stds.add(std2);
		stds.add(std3);
		stds.add(std4);
		stds.add(std5);
		stds.add(std6);
		
		HashMap<String, ArrayList<Student2>> map = new HashMap<>();
		// Iterate ArrayList
		Iterator<Student2> itr= stds.iterator();
		while(itr.hasNext()) {
			
			Student2 s =itr.next();
			// Check if map contains key 
			if(map.containsKey(s.grade())) {
				// get value from that key
				ArrayList<Student2> list= map.get(s.grade());
				// add new Student in arraylist
				list.add(s);
				// replace value of that key
				map.put(s.grade(), list);
			}
			//if key is not present
			else
			{
				//create new arrayList and add object
				ArrayList<Student2> a= new ArrayList<Student2>();
				a.add(s);
				// put key and value in the map
				map.put(s.grade(), a);
			}
		}
		
		Set<String> set=map.keySet();
		Iterator<String> itr1 =set.iterator();
		while(itr1.hasNext()) {
			String s = itr1.next();
			System.out.print(s+"  ");
			System.out.println(map.get(s));
			System.out.println("--------------------------------------------------------------------------------------------------");
		}
	}
	
}
