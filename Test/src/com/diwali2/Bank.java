package com.diwali2;

/*What is difference between constructor and method of class?  
   Bank obj = new Bank(); 					
     	Bank obj1 = obj;	
 i)Share your experience   if we call hashCode() method with both obj and obj1.
ii) how you will call deposite() method of Bank class by using anonymous object?
*/


public class Bank {
	
	public void deposit() {
		
		System.out.println("Amount Deposit...");
	}
	
	
	public static void main(String[] args) {
		
		Bank obj = new Bank ();
		Bank obj1 = obj;
		
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode()); //----->> It will shows the same hashCode because it refer a same memory address
		
		new Bank().deposit();   //----->> We can call methods with Anonymous objects.
		
	}

}
