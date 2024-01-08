package com.ArrayList;

import java.util.ArrayList;


public class FindEmployeeByRequirement {

	public void findByGivenLocation(ArrayList<Employee2> employees, String location) {
		
		ArrayList<Employee2> atLocation = new ArrayList<Employee2>();
		
		for(Employee2 emp : employees) {
			if(emp.d.getLocation().equals(location))
				atLocation.add(emp);	
		}
		System.out.println(atLocation);
	}
	
	public void findByFirstLettter(ArrayList<Employee2> employees, String letter) {
		
		ArrayList<Employee2> names = new ArrayList<Employee2>();
		
		for(Employee2 emp : employees) {
			if(emp.getName().startsWith(letter)) {
				names.add(emp);
			}
		}
		System.out.println(names);	
	}
	public void findByMaximumSalary(ArrayList<Employee2> employees, String department) {
		
		double max=0;
		Employee2 e1=null;
		for(int i=0;i<employees.size();i++) {
			if(employees.get(i).d.depname.equals(department)) {
				
				if(employees.get(i).getSalary()>max) {
					max=employees.get(i).salary;
					e1=employees.get(i);
				}
			}
			
		}
		System.out.println(max+" is a Maximum Salary in "+department +" department "+e1);	
	}
	
}
