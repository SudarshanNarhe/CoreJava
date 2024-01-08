package com.exception;

import java.io.IOException;

//WAP to throw exception still finally should get executed

public class FinallyExample {

	private static void checkException() throws IOException {
		
		throw new IOException("Exception throw in checkException Method by Sudarshan");
	}
	
	public static void main(String[] args) {
		
		try {
			
			checkException();
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("I am in Finally Block");
		}
		System.out.println("Program Continues...");
		
	}
	
}
