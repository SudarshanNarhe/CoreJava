package com.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOfEmployee {

	public static void main(String[] args) {
		
		ArrayList<Employee2> emp = new ArrayList<Employee2>();
		emp.add(new Employee2(101, "Pavan", "Manager", 32,120000, new Department2("IT", 11, "Pune")));
		emp.add(new Employee2(203, "Prashant", "Trainee", 35,45000, new Department2("HR", 32, "Mumbai")));
		emp.add(new Employee2(402, "Aadarsh", "Team Lead", 28,70000, new Department2("Sales", 21, "Pune")));
		emp.add(new Employee2(102, "Utkrsha", "Manager", 38,90000, new Department2("Account", 89, "Chennai")));
		emp.add(new Employee2(106, "Maruti", "Trainee", 32,53000, new Department2("IT", 31, "Banglore")));
		emp.add(new Employee2(202, "Ishwar", "Director", 40,240000, new Department2("R&D", 10, "Nagpur")));
		emp.add(new Employee2(111, "Sudarshan", "Supervisor", 31,210000, new Department2("HR", 8, "Delhi")));
		emp.add(new Employee2(201, "Snehal", "Trainee", 32,32000, new Department2("Account", 45, "Mumbai")));
		emp.add(new Employee2(203, "Sudarshan", "Manager", 36,75000, new Department2("Marketing", 23, "Delhi")));
		emp.add(new Employee2(301, "Pavan", "Team Lead", 29,85000, new Department2("Sales", 18, "Pune")));
	
		System.out.println("Original : "+emp);
		System.out.println("***************************************************************************************************************************************************************************");
		Collections.sort(emp);
		System.out.println("Sorting : "+emp);
		System.out.println("***********************************************************************************************************************************************************************");
		SortEmployeeByLocation obj = new SortEmployeeByLocation();
		Collections.sort(emp, obj);
		System.out.println("Sorting By Location : "+emp);
		System.out.println("***********************************************************************************************************************************************************************");
		SortEmployeeByName obj1 = new SortEmployeeByName();
		Collections.sort(emp, obj1);
		System.out.println("Sorting By Name : "+emp);
		System.out.println("***********************************************************************************************************************************************************************");
		SortEmployeeByAge obj2= new SortEmployeeByAge();
		Collections.sort(emp, obj2);
		System.out.println("Sorting By Age : "+emp);
		System.out.println("***********************************************************************************************************************************************************************");
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a Location : ");
		String str = sc.next();
		FindEmployeeByRequirement find= new FindEmployeeByRequirement();
		
		find.findByGivenLocation(emp, str);
		System.out.println("***********************************************************************************************************************************************************************");
		System.out.println("Enter a first Letter of Name : ");
		String letter=sc.next();
		find.findByFirstLettter(emp, letter);
		System.out.println("***********************************************************************************************************************************************************************");
		System.out.println("Enter a name of Department : ");
		String dept = sc.next();
		find.findByMaximumSalary(emp, dept);
		
		
sc.close();		
	}

}
