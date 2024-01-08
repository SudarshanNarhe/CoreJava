package com.test4;

public class MCQ {

	public static void main(String[] args) {
//		String s1="abc";
//		String s2="abc";
//		System.out.println("s1==s2 is: "+ (s1==s2));
//		String s3= new String("abc");
//		System.out.println((s1==s3));
//		System.out.println(s1.equals(s3));
		//StringBuffer s4= new StringBuffer(s1);
		//System.out.println(s1.equals(s4));
		
		String s="abc";
		String m=new String ("abc");
		System.out.println(s.hashCode());
		System.out.println(m.hashCode());
		String j=m.intern();
		System.out.println(j.hashCode());
		
		m.intern();
		System.out.println(s==m);
		
	}

}
