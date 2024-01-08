package com.test4;

/*Accept a string print following pattern[1]
e.g str=”JAVA”
J
JA
JAV
JAVA
JAV
JA
J*/


public class Que12Pattern {

	public static void main(String[] args) {
		
		String str="JAVA";
		
		for(int i=0;i<str.length();i++) {
			System.out.println(str.substring(0,i+1));
		}
		 for (int i = str.length() - 2; i >= 0; i--) {
	            System.out.println(str.substring(0, i + 1));
	        }
	}

}
