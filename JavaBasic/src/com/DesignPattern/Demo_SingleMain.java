package com.DesignPattern;

public class Demo_SingleMain {

		public static void main(String[] args) {
		
	//	Demo_SingleTon obj = new Demo_SingleTon(); //Explicitaly calling the object 
		Demo_SingleTon obj1=Demo_SingleTon.getobj();
		Demo_SingleTon obj2= Demo_SingleTon.getobj();
		Demo_SingleTon obj3= Demo_SingleTon.getobj();
		
	//	System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		
		obj1.s= " I am from x";
	     obj2.s = "I am from Y"; 
        System.out.println("String from x is " + obj1.s);
        System.out.println("String from y is " + obj2.s);
        System.out.println("String from z is " + obj3.s);
       
	}
	
}
