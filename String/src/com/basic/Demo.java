package com.basic;

public class Demo {

	public static void main(String[] args) {
		
		// It consider same object thats why it refers same hashcode
		String str= new String("Programming");
		String str1= "Java";
		String str2= "Development";
		String str3="Programming";
		System.out.println(str3.hashCode());
		System.out.println(str.hashCode());   
		System.out.println("_____________________________");
		//It connects the words
		String str4= str1.concat(str2).concat(str3);
		System.out.println(str4);
		System.out.println("_____________________________");
		//characters
		char ch[] = {'a','b','c','d','e'};
		String str5 = new String (ch);
		System.out.println(str5);
		System.out.println("_____________________________");
		//count length and remove character from word and count index(index is start from 0)
		String str6= "UtkarshaZabare";
		System.out.println(str6.length());
		System.out.println(str6.charAt(5));
		System.out.println(str6.indexOf('s'));
		System.out.println(str6.indexOf(str6));
		System.out.println("_____________________________");
		//subString and subsequence
		String str7="Sudarshan";
		System.out.println(str7.substring(3));
		System.out.println(str7.substring(1, 3));
		System.out.println(str7.subSequence(1, 3));
		System.out.println("_____________________________");
		//lowercase and uppercase
		String str8="Abhishek";
		System.out.println(str8.toLowerCase());
		System.out.println(str8.toUpperCase());
		System.out.println("__________________________________");
		//replace character
		String str9="IshantPrashant";
		System.out.println(str9.replace('t', 'i'));
		System.out.println(str9.replace(str9, str8));
		System.out.println(str9.repeat(4));
	
		
	}

}
