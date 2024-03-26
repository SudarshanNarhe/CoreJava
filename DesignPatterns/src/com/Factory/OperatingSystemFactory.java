package com.Factory;

public class OperatingSystemFactory {
		
	public OperatingSystem getInstance(String str) {
		
		String str1=str.toLowerCase();
		
		if(str1.equals("android")) {
			return new Android();
		}
		else if(str1.equals("ios")) {
			return new IOS();
		}
		else {
			return new Windows();
		}
	}
	
}
