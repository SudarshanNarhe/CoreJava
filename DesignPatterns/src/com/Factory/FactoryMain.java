package com.Factory;

public class FactoryMain {
	
	public static void main(String[] args) {
//		
//		OperatingSystem obj = new Android();
//		obj.spec();
//		OperatingSystem obj1 = new IOS();
//		obj1.spec();
//		OperatingSystem obj2 = new Windows();
//		obj2.spec();
		
		OperatingSystemFactory obj = new OperatingSystemFactory();
		OperatingSystem os = obj.getInstance("Android");
		os.spec();
		
		OperatingSystem os1 = obj.getInstance("IOS");
		os1.spec();
		
		OperatingSystem os2 = obj.getInstance("Linux");
		os2.spec();
		
	}
}
