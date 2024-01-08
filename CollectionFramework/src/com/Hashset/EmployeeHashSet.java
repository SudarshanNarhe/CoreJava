package com.Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSet {

	public static void main(String[] args) {
		
		HashSet<Employee> emp=new HashSet<Employee>();
		emp.add(new Employee(101, "Sudarshan", 75000));
		emp.add(new Employee(102, "Pavan", 65000));
		emp.add(new Employee(104, "Utkarsha", 85000));
		emp.add(new Employee(105, "Yogesh", 93000));
		emp.add(new Employee(106, "Snehal",89000));
		
		Iterator<Employee> itr =emp.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(emp.hashCode());
		System.out.println("After Adding same Object : "); 
		//We required a implementation of hashcode and equals methods to avoid a duplicates in employee Class
		emp.add(new Employee(101, "Sudarshan", 75000) )	; 
		for(Employee s : emp) {
			System.out.println(s);
		}
		System.out.println(emp.hashCode());
	}

}
