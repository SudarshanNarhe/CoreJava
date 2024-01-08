package com.ArrayList;

import java.util.Comparator;

public class SortEmployeeByName implements Comparator<Employee2> {

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		if(o1.name==o2.name) {
			return o1.salary.compareTo(o2.salary);
		}
		else
			return o1.name.compareTo(o2.name);
	}
	

}
