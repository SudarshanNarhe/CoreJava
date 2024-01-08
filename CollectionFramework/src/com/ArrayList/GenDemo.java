package com.ArrayList;

public class GenDemo <T>{

	T obj;
	
	public GenDemo() {
		
	}
	public GenDemo(T o){
		obj=o;
	}
	public void showType() {
		System.out.println(obj.getClass());
	}
	public T getObject() {
		return obj;
	}
	public static void main(String[] args) {
		
		GenDemo<Integer> obj= new GenDemo<Integer>(23);
		System.out.println(obj.getObject());
		obj.showType();
		
		Integer i = obj.getObject();
		System.out.println(i);
		
		GenDemo<String> obj1= new GenDemo<>("Java");
		System.out.println(obj1.getObject());
		obj1.showType();
		
		String str = obj1.getObject();
		System.out.println(str);
		
	//	obj=obj1;     //----->> It will give the error of mismatch that is it cannot convert from String to Integer
	}
}

