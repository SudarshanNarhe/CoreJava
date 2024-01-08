package com.diwali_2;

public class NonRepeatingChar {

	public static void checkNonRepeating(String str) {
		char []ch = str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			boolean status=true;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					status=false;
				}
			}
			if(status) {
				System.out.println(ch[i]);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		
		String str="Peter Pan";
		checkNonRepeating(str);

	}

}
