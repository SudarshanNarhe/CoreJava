package com.exception;

/*WAP to show 3 different scenario in which null pointer exceptions generated, and handle that 
exception.*/

public class DiffernetScenario {

	public static void main(String[] args) {
		
		String str=null;
		char[] ch=null;
		
		
		try {
		System.out.println(str.charAt(2));
		}catch (NullPointerException e) {
			e.printStackTrace();
		}
		try {
			for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
			}
		}catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		try {
			int a=(Integer) null;
			System.out.println(a);
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println("Programm Continues...");
		
	}
	
}
