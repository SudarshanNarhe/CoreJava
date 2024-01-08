package com.ArrayList;

import java.util.Comparator;

public class SortEmployeeByLocation implements Comparator<Employee2> {

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		
		return o1.d.location.compareTo(o2.d.location);
	}

}
