package com.Assignments;

/*
 * 5. Show one example of method local inner class. 
Try to call method of inner class from main method.



*/

public class Outer_methodLocal {
	
	public void show() {
		
			 class inner {
				
				int b=50;
				
				public void display() {
					System.out.println("b : "+b);
				}
				
			}
			inner in = new inner();
			in.display();
		
	}
	
	
	public static void main(String[] args) {
		
		Outer_methodLocal obj = new Outer_methodLocal();
	
		obj.show();
		
	}
	
}
