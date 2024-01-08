package com.ArrayList;

class TwoGenDemo<T,V>{
	
	T obj;
	V obj1;
	
	public TwoGenDemo() {
		
	}
	public TwoGenDemo(T o, V o1) {
		obj=o;
		obj1=o1;
	}
	public void showTypes() {
		
		System.out.println(obj.getClass());
		System.out.println(obj1.getClass());
	}
	public T getObject() {
		
		return obj;
	}
	public V getObject1() {
		return obj1;
	}
	public static void main(String []arsg) {
		
		TwoGenDemo<String, Integer> obj= new TwoGenDemo<>("Java", 18);
		obj.showTypes();
		System.out.println(obj.getObject());
		System.out.println(obj.getObject1());
	}
}