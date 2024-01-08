package com.diwali2;

import com.diwali_2.Que2;

public class Que_2 {
	
	Que_2(){
	
	}
	
	Que_2(int x){
		System.out.println("In Parameterized Constructor");
	}
	
	public static void main(String[] args) {
		
		Que2 o = new Que2();
		
		/*
		 * we have to make a insatnce variable and method public so it will visible
		 * here...
		 *  
		 * o.t=48; 
		 * o.display();
		 */	
		
		System.out.println(o);
		///to call these method we required a default constructor
		// if we pass any value then it will accept by the parameterized conts.
		Que_2 obj = new Que_2(); 
		System.out.println(obj);
	}

}
