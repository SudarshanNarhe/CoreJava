package com.diwali_2;

import com.diwali3.Application;

public class MobileApp extends Application{

	public MobileApp() {
		System.out.println("I am in Defualt const of MobileApp");
	}
	public MobileApp(int version, String tech) {
		
		super(version,tech);
		System.out.println("I am in Para const of MobileApp");
	}
	@Override
	public void creatSetUp() {
		System.out.println("Mobile Application is Created ");super.creatSetUp();
	}
	public static void main(String[] args) {
		
		MobileApp m = new MobileApp(12, "C++");
		m.creatSetUp();
	}
}
