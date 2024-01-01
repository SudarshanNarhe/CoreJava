package com.BeanClasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Academy {

		//List Of Course Object
		public static ArrayList<Course> courseList = new ArrayList<Course>();
		
		
		//Map Of student where key is Course ID and value is a List Of Student
		//map course id with list of student
		public static HashMap<Integer, List<Student>> studentMap = new HashMap<Integer, List<Student>>();
		
		
		//Map Of Attendance Object where key is Course ID and value is List Of Attendance
		public static HashMap<Integer, List<Attendance>> attendanceMap = new HashMap<Integer, List<Attendance>>();
		
		
		//Map Of TestResult where key is course ID and value is List Of TestResult
		public static HashMap<Integer, List<TestResult>> testResultMap = new HashMap<Integer, List<TestResult>>();
		
		
		//Map Of Transaction where key is course ID and value is List Of Transaction
		// NOTE ONE STUDENT CAN PAY FEES MANY TIME FOR SAME COURSE
		// EG courseId 1 fees is 10k, then in this map for one student 2 entry can also
		// be there. E.g 5k one time, 5k another time
		public static HashMap<Integer, List<Transaction>> transactionMap = new HashMap<Integer,List<Transaction>>(); 
		
}
