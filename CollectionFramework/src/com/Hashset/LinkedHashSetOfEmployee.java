package com.Hashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetOfEmployee {

	public static void main(String[] args) {
		
		LinkedHashSet<Employee> emp = new LinkedHashSet<Employee>();
		emp.add(new Employee(101, "Pavan", 85000));
		emp.add(new Employee(102, "Utkarsha", 60000));
		emp.add(new Employee(103, "Sudarshan", 75000));
		emp.add(new Employee(104,"Snehal",95000));
		emp.add(new Employee(105, "Yogesh", 77000));
		
		Iterator<Employee> itr= emp.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("------------------------------------------------------");
		emp.add(new Employee(104,"Snehal",95000));
		itr= emp.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
