package com.ManagerClasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import com.BeanClasses.Academy;
import com.BeanClasses.Attendance;
import com.BeanClasses.Date;

public class AttendanceManager {

	public static void dummyAddforAttendance() {
		addAttendance(1);
		addAttendance(2);
		addAttendance(3);
		
	}
	public static void addAttendance(int CourseID) {
		
		Attendance std1= new Attendance(1, 101, "Present", new Date(1,10,2023));
		Attendance std2= new Attendance(2, 102, "Present", new Date(1,10,2023));
		Attendance std3= new Attendance(3, 103, "Absent", new Date(1,10,2023));
		Attendance std4= new Attendance(4, 104, "Present", new Date(1,10,2023));
		Attendance std5= new Attendance(5, 105, "Absent", new Date(1,10,2023));
		Attendance std6 = new Attendance(6, 106, "Present", new Date(1,10,2023));
		Attendance std7 = new Attendance(7, 107, "Present", new Date(1,10,2023));
		
		if(CourseID==1) {
			ArrayList<Attendance> attendance1 = new ArrayList<Attendance>();
			attendance1.add(std2);
			attendance1.add(std5);
			Academy.attendanceMap.put(1, attendance1);
		}
		else if(CourseID==2) {
			ArrayList<Attendance> attendance2=new ArrayList<Attendance>();
			attendance2.add(std1);
			attendance2.add(std3);
			attendance2.add(std6);
			Academy.attendanceMap.put(2, attendance2);
		}
		else if(CourseID==3) {
			ArrayList<Attendance> attendance3 = new ArrayList<Attendance>();
			attendance3.add(std4);
			attendance3.add(std7);
			Academy.attendanceMap.put(3, attendance3);
		}
				
	}
	public static void showAttendance() {
		
		Iterator<Entry<Integer, List<Attendance>>> itr =Academy.attendanceMap.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
}
