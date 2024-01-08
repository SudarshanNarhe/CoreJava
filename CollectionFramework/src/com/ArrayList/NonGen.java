package com.ArrayList;

public class NonGen {

	Object obj;
	
	public NonGen() {
		
	}
	public NonGen(Object o) {
		obj=o;
	}
	public void showType() {
		System.out.println(obj.getClass());
	}
	Object getObj() {
		return obj;
	}
	public static void main(String[] args) {
		
		NonGen obj=new NonGen(23);
		obj.showType();
		System.out.println(obj.getObj());
		
		int i =(int) obj.getObj(); //1. We need to do a typeCasting everytime when we try to get value 
		System.out.println(i);
		
		NonGen obj1= new NonGen("Java");
		obj1.showType();
		System.out.println(obj1.getObj());
		
		String str= (String) obj1.getObj();
		System.out.println(str); //We need to do a typeCasting everytime when we try to get value 
		System.out.println("-----------------------");
		obj=obj1;//2. There is a ClassCastException which basically it should be show at a time of compilation
		String a = (String) obj.getObj();
		System.out.println(a);
		
		int b = (int) obj.getObj();
		System.out.println(b);
	}
}
