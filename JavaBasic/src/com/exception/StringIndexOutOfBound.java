package com.exception;

/*WAP to show the scenario in which IndexOutBound Exception (Both ArrayInexOutOfBound and 
StringIndexOutOfBound) exception is generated and handle this exception.*/

public class StringIndexOutOfBound {

	public static void main(String[] args) {
	
		String str= "YogeshDada";
		
		try {
			for(int i=0;i<=str.length();i++) {
				System.out.println(str.charAt(i));
			}
		}catch(ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Programm Continues...");
	}
	
}
