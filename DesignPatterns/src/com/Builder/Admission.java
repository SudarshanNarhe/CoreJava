package com.Builder;

public class Admission {
	
	public static void main(String[] args) {
		
//		Student std= new Student(11, "Sudarshan", 99, "IT/CS", "Java");
//		System.out.println(std);
		
		AdmissionBuilder obj = new AdmissionBuilder();
		obj.setCourse("C#");
		obj.setName("Suraj");
		obj.setId(12);
		
		Student s =obj.getAdmission();
		System.out.println(s);
		
		Student std= new AdmissionBuilder().setId(12).setCourse("Java").setName("Sudarshan").getAdmission();
	
		System.out.println(std);
		
	}
	
}
