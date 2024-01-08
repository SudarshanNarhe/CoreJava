package com.demo;

class Demo3{
	
	public void sum(int a, int b) {
		System.out.println("In Parent 1 : "+(a+b));
	}
	public int sum(int a, int b,int c) {
		System.out.println("In Parent 2 : "+(a+b+c));
		return a+b+c;
	}
	
}

public class MethodOverloading1 extends Demo3{

	public void sum(int a, int b) {
		System.out.println("In child 1 : "+(a+b));
	}
	public int sum(int a, int b,int c) {
		System.out.println("In child 2 :"+(a+b+c));
		return a+b+c;
	}
	public static void main(int a, int b) {
		System.out.println("In main : "+(a+b));
	}
	public static void main(String[] args) {
		MethodOverloading1 obj= new MethodOverloading1();
		obj.sum(1, 2, 3);
		Demo3 obj1= new MethodOverloading1();
		obj1.sum(3, 4);
	
//		MethodOverloading1 obj2 = (MethodOverloading1) new Demo3();
//		obj2.sum(12,10);
		
		main(3, 3);
	}

}
