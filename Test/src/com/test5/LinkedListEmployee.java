package com.test5;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEmployee {

	public static void main(String[] args) {
		
		LinkedList<Employee> emp= new LinkedList<Employee>();
		emp.add(new Employee(11, "Sudarshan", new Department(101, "IT")));
		emp.add(new Employee(12, "Pavan", new Department(102, "Testing")));
		emp.add(new Employee(10, "Rohit", new Department(103, "Account")));
		emp.add(new Employee(13, "Yogesh", new Department(104, "Sales")));
		emp.add(new Employee(14, "Abhishek", new Department(105, "HR")));
		emp.add(new Employee(15, "Suraj", new Department(101, "IT")));
		
	
		ListIterator<Employee> itr= emp.listIterator();
		Department d= null;
		while(itr.hasNext()) {
			Employee e= itr.next();
			if(e.getEid()==10) {
				d=e.getD();
			}	
		}
		for(int i=0;i<emp.size();i++) {
			if(emp.get(i).getD().equals(d)) {
				emp.remove(i);
				//i--;
			}
		}
		for(int i=0;i<emp.size();i++) {
			System.out.println(emp.get(i));
		}
			
		
	}

}
