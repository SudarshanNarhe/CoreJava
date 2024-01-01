package com.ManagerClasses;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import com.BeanClasses.Academy;
import com.BeanClasses.Course;
import com.BeanClasses.Date;
import com.BeanClasses.Student;
import com.BeanClasses.Transaction;

public class AllManager {


	/*
	 * Show one table which has course name , course start date and total students,
	 * total revenue till date, total left fees, total projected revenue percentage
	 * collection till date
	 */
	
	
	public static void showTableRevenue() {
		Iterator<Course> courseitr =Academy.courseList.iterator();
		while(courseitr.hasNext()) {
			Course c = courseitr.next();
			int courseId=c.getCourseid();
			double coursefee=c.getFees();
			double totalRevenue=coursefee;
			Date date= c.getStartDate();
			Iterator<Entry<Integer, List<Student>>> studentitr=Academy.studentMap.entrySet().iterator();
			while(studentitr.hasNext()) {
				Entry<Integer, List<Student>> stdentry = studentitr.next();
				int courseIdStd=stdentry.getKey();
				List<Student> studentlist=stdentry.getValue();
				if(courseId==courseIdStd) {
					totalRevenue= totalRevenue+coursefee;
					System.out.println("Course Name : "+c.getCourseName());
					System.out.println("Course ID : "+courseId);
					System.out.println("Start Date : "+date);
					System.out.println("Student List : ");
					System.out.println(studentlist);
				Iterator<Entry<Integer, List<Transaction>>> transactionitr=Academy.transactionMap.entrySet().iterator();
				while(transactionitr.hasNext()) {
					Entry<Integer, List<Transaction>> transentry=transactionitr.next();
					int courseIdtrans= transentry.getKey();
					List<Transaction> transList = transentry.getValue();
					double revenue=0;
					if(courseIdtrans==courseIdStd) {
						Iterator<Transaction> transaction = transList.iterator();
						while(transaction.hasNext()) {
							Transaction obj = transaction.next();
							double paidFees=obj.getPaidFees();
							revenue=revenue+paidFees;
						}
						System.out.println("\nTotal Revenue : "+totalRevenue);
						System.out.println("Total Paid Fees : "+revenue);
						double leftfees=(totalRevenue-revenue);
						System.out.println("Left Fees : "+leftfees);
						double projectedcollection=(revenue/totalRevenue)*100;
						System.out.println("Total Projected Collection is : "+projectedcollection);
						
						System.out.println("-----------------------------------------------------------");
						
						}
							
					}
				}
			}
		}
		
	}
	
}
