package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Employee2Map {

	public static double findMaxSalary(List<Employee2> list) {
		double max=0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getSalary()>max) {
				max=list.get(i).getSalary();
			}
		}
		return max;		
	}	
	public static void main(String[] args) {

		Department2 d1 = new Department2(100, "IT", "Pune");
		Department2 d2 = new Department2(101, "Account", "Mumbai");
		Department2 d3 = new Department2(102, "HR", "Chennai");
		Department2 d4 = new Department2(103, "Marketing", "Delhi");
		Department2 d5 = new Department2(104, "Testing", "Pune");

		ArrayList<Employee2> emp1 = new ArrayList<Employee2>();
		emp1.add(new Employee2(11, 100, "Sudarshan", 98000));
		emp1.add(new Employee2(12, 100, "Suraj", 98000));
		emp1.add(new Employee2(13, 100, "Yogesh", 82000));
		emp1.add(new Employee2(14, 100, "Prashant", 50000));
		emp1.add(new Employee2(15, 100, "Nishank", 55000));
		emp1.add(new Employee2(16, 100, "Sujay", 78000));

		ArrayList<Employee2> emp2 = new ArrayList<Employee2>();
		emp2.add(new Employee2(21, 101, "Pritam", 56000));
		emp2.add(new Employee2(22, 101, "Aadarsh", 45000));
		emp2.add(new Employee2(23, 101, "Sunish", 35000));
		emp2.add(new Employee2(24, 101, "Harshal", 76000));

		ArrayList<Employee2> emp3 = new ArrayList<Employee2>();
		emp3.add(new Employee2(31, 102, "Bhakti", 45000));
		emp3.add(new Employee2(32, 102, "Utkarsha", 62000));
		emp3.add(new Employee2(33, 102, "Abhishek", 77000));

		ArrayList<Employee2> emp4 = new ArrayList<Employee2>();
		emp4.add(new Employee2(41, 103, "Shubhangi", 58000));
		emp4.add(new Employee2(42, 103, "Pavan", 97000));
		emp4.add(new Employee2(43, 103, "Snehal", 47000));
		emp4.add(new Employee2(44, 103, "Prabhakar", 56000));

		ArrayList<Employee2> emp5 = new ArrayList<Employee2>();
		emp5.add(new Employee2(51, 104, "Ulka", 83000));
		emp5.add(new Employee2(52, 104, "Neha", 56000));
		emp5.add(new Employee2(53, 104, "Nitin", 62000));
		emp5.add(new Employee2(54, 104, "Ajit", 92000));

		HashMap<Department2, ArrayList<Employee2>> employeeMap = new HashMap<Department2, ArrayList<Employee2>>();
		employeeMap.put(d1, emp1);
		employeeMap.put(d2, emp2);
		employeeMap.put(d3, emp3);
		employeeMap.put(d4, emp4);
		employeeMap.put(d5, emp5);
		
		//Display all the department wise employee.
		
		Set<Entry<Department2, ArrayList<Employee2>>> sst = employeeMap.entrySet();
		Iterator<Entry<Department2, ArrayList<Employee2>>> itr= sst.iterator();
		while(itr.hasNext()) {
			Entry<Department2, ArrayList<Employee2>> ele=itr.next();
			Department2 obj= ele.getKey();
			System.out.println(obj.getDepName()+"  "+obj.getDepID());
			
			ArrayList<Employee2>arr=ele.getValue();
			Iterator<Employee2> itr1 =arr.iterator();
			while(itr1.hasNext()) {
				System.out.println(itr1.next());
				}
			System.out.println();
			
			}
			
		System.out.println("****************************************************************************************************************************************");
		
		//Find max salary along with Employee details in all departments
		System.out.println("Maximum Salary ------->>");
		itr=sst.iterator();
		while(itr.hasNext()) {
			Entry<Department2, ArrayList<Employee2>> e =itr.next();
			System.out.println(e.getKey().getDepName()+"  "+e.getKey().getDepID());
			Iterator<Employee2> elit= e.getValue().iterator();
			double max =0;
			Employee2 e1= null;
			while(elit.hasNext()) {
				Employee2 obj1 = elit.next();
				if(obj1.getSalary()>max) {
					max=obj1.getSalary();
					e1=obj1;
				}
			}
			System.out.println("Maximum Salary is : "+max +" of Employee : "+e1);
		}
		System.out.println();
		
		System.out.println("****************************************************************************************************************************************");
		
		//display  all employees from IT departments who is having salary less than 70K
		System.out.println("Salary less than 70k ------>>");
		itr=sst.iterator();
		while(itr.hasNext()) {
			Entry<Department2, ArrayList<Employee2>> e =itr.next();
			if(e.getKey().getDepName().equals("IT")) {
			System.out.println(e.getKey().getDepName()+"  "+e.getKey().getDepID());
			Iterator<Employee2> elist =e.getValue().iterator();
			while(elist.hasNext()) {
				Employee2 e1= elist.next();
				if(e1.getSalary()<70000) {
					System.out.println(e1);
				}
			}
				//System.out.println();
		}
			
	}
		System.out.println("****************************************************************************************************************************************");
		
		//Add the new employee in Testing department
		System.out.println("By Adding new Employee in Testing Department : ");
		itr=sst.iterator();
		while(itr.hasNext()) {
			Entry<Department2, ArrayList<Employee2>> e=itr.next();
			Department2 obj=e.getKey();
			if(obj.getDepName().equals("Testing")) {
				ArrayList<Employee2> arr=e.getValue();
				Employee2 emp=new Employee2(98, 104, "Sunil", 35000);
				arr.add(emp);
				employeeMap.put(obj, arr);
			}	
		}
		System.out.println(employeeMap.get(new Department2(104, "Testing", "Pune")));
		
		System.out.println("************************************************************************************************************************************************************************************************************************************************************************************");

		// Give department details in which maximum number of Employees working.
		System.out.println("Maximum Employee Work in department ------->>");
		itr=sst.iterator();
		int max=0;
		Department2 ob=null;
		while(itr.hasNext()) {
			Entry<Department2, ArrayList<Employee2>> e= itr.next();
			int count=0;
			Iterator<Employee2> e1=e.getValue().iterator();
			while(e1.hasNext()) {
				Employee2 e2=e1.next();
				if(e2.getId()>count) {
					count++;
					
				}
			}
			if(count>max) {
				max=count;
				ob=e.getKey();
			}	
		}
		System.out.println("Maximum "+max+" Employees working in department \n"+ob);
		
		System.out.println("****************************************************************************************************************************************");
		
		//Find Employee By Location...
		System.out.println("Employee of given Location --------->> ");
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Location : ");
		String location= sc.next();
		itr=sst.iterator();
		while(itr.hasNext()) {
			Entry<Department2, ArrayList<Employee2>> et=itr.next();
			Department2 obj=et.getKey();
			if(obj.getLocation().equals(location)) {
				ArrayList<Employee2> arr=et.getValue();
				Iterator<Employee2> itr2=arr.iterator();
				while(itr2.hasNext()) {
					System.out.println(itr2.next());
				} 
			}
		}
		
//	 System.out.println("****************************************************************************************************************************************");
	
		
sc.close();		
	}
}


