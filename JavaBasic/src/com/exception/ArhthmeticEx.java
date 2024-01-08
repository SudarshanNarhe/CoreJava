package com.exception;

public class ArhthmeticEx {
	
	public int check() {
		int num=0;
		try {
			num=20/0;
			System.out.println(num);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("I am in Finally");
		}
		return num;
	}
	public static void main(String[] args) {
		
		System.out.println("Main Starts");
		
		ArhthmeticEx obj = new ArhthmeticEx();
		int res=obj.check();
		System.out.println(res);
		System.out.println("Main Ends...");
	}

}
