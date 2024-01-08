package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

//WAP to create a map using Custom class as key and any other Custom class as value

public class EmployeeMap {

	public static void main(String[] args) {
		
		HashMap< Employee, Department> employeeMap = new HashMap<Employee,Department >();
		employeeMap.put(new Employee(101, "Sudarshan", 87000),new Department(11, "IT", "Pune"));
		employeeMap.put(new Employee(102, "Prashant", 75000), new Department(12, "HR", "Mumbai"));
		employeeMap.put(new Employee(103, "Snehal", 94000), new Department(13, "Account", "Chennai"));
		employeeMap.put(new Employee(104, "Yash", 54000), new Department(14, "Sales", "Banglore"));
		employeeMap.put(new Employee(105, "Nitin", 78000), new Department(15, "IT", "Delhi"));
		
		Set<Entry<Employee, Department>> emp = employeeMap.entrySet();
		Iterator<Entry<Employee, Department>>itr = emp.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
