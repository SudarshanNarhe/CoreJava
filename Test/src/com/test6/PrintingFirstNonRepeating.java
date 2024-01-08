package com.test6;


public class PrintingFirstNonRepeating {

	public static void main(String[] args) {

		String str = "My Name is Sudarshan";
		
		char []ch = str.toCharArray();
		for(int i=0; i<ch.length;i++) {
			int count =0;
			for(int j=i+1;j<ch.length-1;j++) {
				if(ch[i]==ch[j]) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(ch[i]);
				break;
			}
		}
	
	}

}
