package com.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetOfEmployee {

	public static void main(String[] args) {
		
		TreeSet<Employee> set= new TreeSet<Employee>();
		set.add(new Employee(11, "Sudarshan"));
		set.add(new Employee(12, "Pavan"));
		set.add(new Employee(13,"Utkarsha"));
		set.add(new Employee(14, "Nitin"));
		set.add(new Employee(15, "Aadarsh"));
		set.add(new Employee(16,"Snehal"));
		set.add(new Employee(12, "Pavan"));
		
		Iterator<Employee> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("By using Comparator : ");
		
		TreeSet<Employee> set1= new TreeSet<Employee>(new comapareByID());
		set1.add(new Employee(11, "Sudarshan"));
		set1.add(new Employee(12, "Pavan"));
		set1.add(new Employee(13,"Utkarsha"));
		set1.add(new Employee(14, "Nitin"));
		set1.add(new Employee(15, "Aadarsh"));
		set1.add(new Employee(16,"Snehal"));
		set1.add(new Employee(12, "Pavan"));
		
		Iterator<Employee> itr1 = set.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		
	}

}
