package com.ManagerClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import com.BeanClasses.Academy;
import com.BeanClasses.Date;
import com.BeanClasses.TestResult;


public class TestResultManager {

	public static void addDummyforTestResult() {
		addTestResult(1);
		addTestResult(2);
		addTestResult(3);
	}
	
	public static void addTestResult(int CourseID) {
		
		TestResult student1= new TestResult(new Date(3,11,2023), 1001, 102, 1, 90, 100);
		TestResult student2= new TestResult(new Date(3,11,2023), 1001, 105, 1, 80, 100);
		TestResult student3= new TestResult(new Date(5,11,2023), 1002, 101, 2, 70, 100);
		TestResult student4= new TestResult(new Date(5,11,2023), 1002, 103, 2, 38, 100);
		TestResult student5= new TestResult(new Date(5,11,2023), 1002, 106, 2, 30, 100);
		TestResult student6= new TestResult(new Date(7,11,2023), 1003, 104, 3, 90, 100);
		TestResult student7= new TestResult(new Date(7,11,2023), 1003, 107, 3, 70, 100);

		if(CourseID==1) {
			ArrayList<TestResult> resultList1= new ArrayList<TestResult>();
			resultList1.add(student1);
			resultList1.add(student2);
			Academy.testResultMap.put(1, resultList1);
		}
		else if(CourseID==2) {
			ArrayList<TestResult> resultList2 = new ArrayList<TestResult>();
			resultList2.add(student3);
			resultList2.add(student4);
			resultList2.add(student5);
			Academy.testResultMap.put(2, resultList2);
		}
		else if(CourseID==3) {
			ArrayList<TestResult> resultList3 = new ArrayList<TestResult>();
			resultList3.add(student6);
			resultList3.add(student7);
			Academy.testResultMap.put(3, resultList3);
		}
			
	}
	
	public static void showTestResult() {
		
		Iterator<Entry<Integer, List<TestResult>>> itr =Academy.testResultMap.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	//show poor performing students (marks <40%) across all tests for a course id.
	public static void countPercentageForPoorPerformance() {
		
		double percentage=0;
		Iterator<Entry<Integer, List<TestResult>>> mapOfResult=Academy.testResultMap.entrySet().iterator();
		ArrayList<TestResult> poorStudents= new ArrayList<TestResult>();
		while(mapOfResult.hasNext()) {
			Entry<Integer, List<TestResult>> ResultEntry=mapOfResult.next();
			
			List<TestResult> list=ResultEntry.getValue();
			Iterator<TestResult> itr = list.iterator();
			while(itr.hasNext()) {
				TestResult obj =itr.next();
				int marks=obj.getMarks();
				//System.out.println(marks);
				int outOf=obj.getOutOfMarks();
				//System.out.println(outOf);
				percentage=(marks*100)/outOf;
				//System.out.println(percentage);
				if(percentage<40) {
					poorStudents.add(obj);
				}
			}
		}
		System.out.println(poorStudents);
		
	}
	
	//show student result for course id and test id sorted from topper to lowest marks. 
	//If student marks are equal sort on their names
	public static void comaparing() {
		
		Iterator<Entry<Integer, List<TestResult>>> result=Academy.testResultMap.entrySet().iterator();
		while(result.hasNext()) {
			Entry<Integer, List<TestResult>> entryres=result.next();
			
			Collections.sort(entryres.getValue());
			System.out.println("Course id : "+entryres.getKey());
			System.out.println(entryres.getValue());
		}
	
	}
	
}


