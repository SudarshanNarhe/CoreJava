package com.clone1;

import com.clone.Employee;

public class EmployeeClone {

	public static void main(String[] args) {
		
		Employee obj = new Employee(23,56000,"Sudarshan");
		
		Employee obj2=null;
		try 
		{
			obj2 = (Employee) obj.clone();
		}
		catch (CloneNotSupportedException e) 
		{
			
			e.printStackTrace();
		}
		System.out.println(obj);
		System.out.println(obj2);
		
	}

}
