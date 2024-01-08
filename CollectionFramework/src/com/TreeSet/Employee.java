package com.TreeSet;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{

	int id;
	String name;
	
	public Employee() {
		
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emloyee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employee o) {
		if(this.id>o.id)
		return 1;
		else if(this.id<o.id)
			return-1;
		else
			return 0;
	}

}

class comapareByID implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getId()>o2.getId())
		return 1;
		else if(o1.getId()<o2.getId())
			return -1;
		else
			return 0;
	}
	
	
	
}
