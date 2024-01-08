package com.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class StudentArray {

	public static void main(String[] args) {
		ArrayList<Student> std = new ArrayList<Student>();
		ArrayList<Integer>m1= new ArrayList<Integer>(Arrays.asList(95,95,95,95,95));
		std.add(new Student(2, "Ishwar", m1));
		ArrayList<Integer>m2= new ArrayList<Integer>(Arrays.asList(70,91,83,57,92));
		std.add(new Student(1, "Aadarsh", m2));
		ArrayList<Integer>m3= new ArrayList<Integer>(Arrays.asList(81,93,71,68,83));
		std.add(new Student(5, "Prashant", m3));
		ArrayList<Integer>m4= new ArrayList<Integer>(Arrays.asList(92,83,74,89,60));
		std.add(new Student(9, "Yogesh", m4));
		ArrayList<Integer>m5= new ArrayList<Integer>(Arrays.asList(89,70,80,60,83));
		std.add(new Student(7, "Suraj", m5));
		ArrayList<Integer>m6= new ArrayList<Integer>(Arrays.asList(81,93,94,85,70));
		std.add(new Student(8, "Sumit", m6));
		ArrayList<Integer>m7= new ArrayList<Integer>(Arrays.asList(80,91,73,75,69));
		std.add(new Student(10, "Aadarsh", m7));
		ArrayList<Integer>m8= new ArrayList<Integer>(Arrays.asList(81,93,71,68,83));
		std.add(new Student(6, "Suraj", m8));
		ArrayList<Integer>m9= new ArrayList<Integer>(Arrays.asList(83,97,82,73,69));
		std.add(new Student(4, "Utkrsha", m9));
		ArrayList<Integer>m10= new ArrayList<Integer>(Arrays.asList(89,84,70,79,73));
		std.add(new Student(3, "Snehal", m10));
		
		Iterator<Student>itr= std.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("---------------------------------------------------------------------");
		
		System.out.println("Sorting Using name : ");
		Collections.sort(std);
		itr=std.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
