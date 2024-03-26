package com.SingleTon;

public class SingleTone {
		
		private static SingleTone obj= new SingleTone();
		
		private SingleTone() {
			
		}
	
		public static SingleTone getInstance() {
			
			if(obj==null) {
				synchronized(SingleTone.class) {
					System.out.println("In syn");
					if(obj==null) {
						System.out.println("In Synch if");
						obj=new SingleTone();
					}
				}
			}
			System.out.println("Outside if");
			return obj;
		}
		
		public void playing() {
			System.out.println("I am Playing");
		}
		
		
}	
