package com.CollectionAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeArrayList {

	public static void main(String[] args) {
		
		ArrayList<Employee> emp= new ArrayList<>();
		emp.add(new Employee(11, "Yogesh"));
		emp.add(new Employee(10,"Sudarshan"));
		emp.add(new Employee(16,"Snehal"));
		emp.add(new Employee(12,"Pavan"));
		emp.add(new Employee(13,"Aadarsh"));
		emp.add(new Employee(15,"Ishwar"));
		
		Iterator<Employee> itr = emp.iterator();
		System.out.println("Original : ");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("_____________________________________________________________________");
		
		//Write the necessary code to sort employee objects by empId
		System.out.println("Sorted By Id : ");
		Collections.sort(emp,new SortByEmployeeId());
		itr = emp.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("_____________________________________________________________________");

		//Complete following code to sort above employee object by name. Employee object 
		//is from same earlier program.
		System.out.println("Sorted By Name : ");
		Collections.sort(emp, new SortEmployeeByName());
		itr = emp.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}

}
