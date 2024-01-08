package com.DesignPattern;

public class Demo_SingleTon {
	
	private static Demo_SingleTon obj;
	
	public String s;
	
	private Demo_SingleTon() {
		s="Hello I am a string part of Singleton class";
	}
	public static Demo_SingleTon getobj() {
		if(obj==null) {
			obj= new Demo_SingleTon();
		}
		return obj;
	}
	
}
