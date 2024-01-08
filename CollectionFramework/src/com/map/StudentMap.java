package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

//WAP to create a map using Custom class as key and any other JDK provided object as value

public class StudentMap {

	public static void main(String[] args) {
		
		Student s1= new Student(12,"Sudarshan",450);
		Student s2= new Student(13,"Prashant",480);
		Student s3= new Student(14, "Yogesh", 360);
		Student s4= new Student(15, "Ishwar", 340);
		Student s5 = new Student(16, "Pavan", 490);
		
		HashMap<Student, String> studentmap= new HashMap<Student, String>();
		studentmap.put(s1, "Java");
		studentmap.put(s2, "Python");
		studentmap.put(s3, "C#");
		studentmap.put(s4, "Soft Skills");
		studentmap.put(s5, "C++");
		studentmap.put(s1, "SQL");
		
		studentmap.put(new Student(23,"Aadarsh",460) , "Science");
		
		//System.out.println(studentmap);
		
		Set<Entry<Student, String>> std= studentmap.entrySet();
		Iterator<Entry<Student, String>> itr = std.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
}
