package com.ManagerClasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import com.BeanClasses.Academy;
import com.BeanClasses.Course;
import com.BeanClasses.Date;
import com.BeanClasses.Student;
import com.BeanClasses.Transaction;

public class TransactionManager {

	public static void dummyAddforTransaction() {
		addTransaction(1);
		addTransaction(2);
		addTransaction(3);
		
	}
	
	public static void addTransaction(int CourseID) {
		
		Transaction student1= new Transaction(101,70000,new Date(23,9,2023));
		Transaction student2= new Transaction(102, 30000, new Date(12,9,2023));
		Transaction student3 = new Transaction(103, 50000, new Date(31,9,2023));
		Transaction student4 = new Transaction(105, 25000, new Date(1,10,2023));
		Transaction student5 = new Transaction(107, 80000, new Date(5,10,2023));
		Transaction student6= new Transaction(102,50000,new Date(23,11,2023));
		Transaction student7= new Transaction(101,40000,new Date(23,9,2023));
		Transaction student8= new Transaction(102,40000,new Date(23,9,2023));

		
		
		if(CourseID==1) {
			ArrayList<Transaction> transList1 = new ArrayList<Transaction>();
			transList1.add(student2);
			transList1.add(student4);
			transList1.add(student6);
			transList1.add(student8);
			Academy.transactionMap.put(1, transList1);
		}
		else if(CourseID==2) {
			ArrayList<Transaction> transList2 = new ArrayList<Transaction>();
			transList2.add(student1);
			transList2.add(student3);
			transList2.add(student7);
			Academy.transactionMap.put(2, transList2);
		}
		else if(CourseID==3) {
			ArrayList<Transaction> transList3 = new ArrayList<Transaction>();
			transList3.add(student5);
			Academy.transactionMap.put(3, transList3);
		}
				
	}
	
	public static void showTransaction() {
		Iterator<Entry<Integer, List<Transaction>>> itr=Academy.transactionMap.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
	/*
	 * find our students who paid all fees, use LinkedHashMap in order to find out
	 * those first 3 students across courses who paid full fees ( note student can
	 * pay fee in part installment or one time as well)
	 */
	
	public static void paidAllFees() {
		
		Iterator<Course> course = Academy.courseList.iterator();
		int sum = 0;
		LinkedList<Student> paidStudents = new LinkedList<Student>();
		while (course.hasNext()) {
			Course cs = course.next();
			double fees = cs.getFees();
			int courseID = cs.getCourseid();
			Iterator<Entry<Integer, List<Student>>> List = Academy.studentMap.entrySet().iterator();
			while (List.hasNext()) {
				Entry<Integer, List<Student>> studentList = List.next();

				if (courseID == studentList.getKey()) {
					List<Student> sl = studentList.getValue();
					Iterator<Student> std = sl.iterator();

					while (std.hasNext()) {
						Student sobj = std.next();
						int stdID = sobj.getStudentID();
						sum = 0;

					Iterator<Entry<Integer, List<Transaction>>> transList = Academy.transactionMap.entrySet().iterator();
						while (transList.hasNext()) {
							Entry<Integer, List<Transaction>> trans = transList.next();
							List<Transaction> tr = trans.getValue();
							Iterator<Transaction> itr = tr.iterator();

							while (itr.hasNext()) {
								Transaction obj = itr.next();
								if (obj.getStudentID() == stdID) {
									sum = sum + obj.getPaidFees();
								}

							}

						}
						if(sum==fees) {
							paidStudents.add(sobj);
						}
					}
				}
			}

		}
		System.out.println(paidStudents);

	}
		
}
