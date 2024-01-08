package com.diwali5;

public class Output2 {

	public static void main(String[] args) {
		
				String s1 = "something";
				final String s2 = "anything";
				String s3 = "something".concat(s2);
				String s4 = "something".concat("anything");
				System.out.println(s3);
				System.out.println(s4);
				System.out.println(s3 == s4); 
				String s5 = "something" + (s2);
				String s6 = "something" + "anything";
				System.out.println(s5);
				System.out.println(s6);
				System.out.println(s5 == s6);
				
				System.out.println(s1.hashCode());
				System.out.println(s2.hashCode());
				System.out.println(s3.hashCode());
				System.out.println(s4.hashCode());
				System.out.println(s5.hashCode());
				System.out.println(s6.hashCode());
				
				System.out.println(s3.equals(s4));
	}

}
