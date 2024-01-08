package com.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


//1.Let employee class have a department object. Iterate through aarraylist of employees.

//2.Use copy method of collections class to make a copy of given arraylist of employees. 
//Check if it creates shallow copy or deep copy. Check if department objects are also copied.

//3.Sort Arraylist of employees on employee names using comparable interface.

public class Employee implements Comparable<Employee>{
	
	int id;
	String name;
	Department d;
	
	public Employee() {
		
	}
	public Employee(int id, String name, Department d) {
		this.id=id;
		this.name=name;
		this.d=d;
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
	public String toString() {
		return "\nEmployee ID : "+id+"\nEmployee name : "+name+"\n"+d.toString();
	}
	@Override
	public int compareTo(Employee o) {
		int res=this.name.compareTo(o.name);
		return res;
	}
	public static void main(String[] args) {
		
		ArrayList<Employee> obj = new ArrayList<Employee>();
		obj.add(new Employee(11,"Sudarshan",new Department("Java", 101)));
		obj.add(new Employee(22,"Pavan",new Department("SQL", 202)));
		obj.add(new Employee(55, "Aadarsh",new Department("Microsoft", 505)));
		obj.add(new Employee(88, "Ishwar", new Department("Python", 808)));
		obj.add(new Employee(33, "Prashant", new Department("C++", 303)));
		
		Iterator<Employee> itr = obj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----------------------------------------------------------");
		System.out.println("Copied : ");
		ArrayList<Employee>obj1=new ArrayList<>(Collections.nCopies(obj.size(),null));
		Collections.copy(obj1,obj);
		System.out.println(obj1);
		
//		Just for the understanding
//		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
//		ArrayList<Integer>arr1 = new ArrayList<Integer>(Collections.nCopies(arr.size(), 4));
//		System.out.println(arr1);
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("After Sorting : ");
		Collections.sort(obj);
		itr=obj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	
}
