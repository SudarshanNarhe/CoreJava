package com.diwali_2;

public class CallMainMethod {
	
	public static void main(int a ) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		String str= args[0];
		System.out.println(str);
		
		main(4);
		
	}

}
