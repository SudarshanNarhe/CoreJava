package com.basic;

/*1.  String create with new operator and without new
2.  Compare string using == when we create without new see same reference is there
3.  Compare string using new operator when new is present see different reference is there.*/

public class StringCreation {

	public static void main(String[] args) {
		
		String str = new String("Sudarshan");
		String str1 = "Sudarshan";
		String str2 = new String("Sudarshan");
		String str3 = "Sudarshan";
		
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		
		
		if(str2==str1)
			System.out.println("Same");
		else
			System.out.println("Not same");
		
		if(str==str1)
			System.out.println("Same");
		else
			System.out.println("Not same");
		
		if(str==str2)
			System.out.println("Same");
		else
			System.out.println("Not same");
		
		if(str1==str3)
			System.out.println("Same");
		else
			System.out.println("Not Same");
		
		System.out.println(str.equals(str2));
	}

}
