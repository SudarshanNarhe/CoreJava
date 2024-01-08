package com.diwali3;

public class Que3 {

	public void method1(int a) {
		
	}
	public void method2(int a) {
		
	}
	public static void method3(int a) {
		
	}
	public static void method4(int a) {
		
	}
	
}

/*
 * a. Which method overrides a method in the superclass?
 * ans. -->> method2 
 * b. Which method hides a method in the superclass?
 * ans. -->> method4
 * c. What do the other methods do?
 * ans. -->> Compile Time Error
 */

 class B extends Que3
 {
		
		/*
		 * public static void method1(int a) {
		 * 
		 * }
		 */
		 
		public void method2(int a) {
			
		}

		/*
		 * public void method3(int a) {
		 * 
		 * }
		 */
		public static void method4(int a) {
			
		}
 }