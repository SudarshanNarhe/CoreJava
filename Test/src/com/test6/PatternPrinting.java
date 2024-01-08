package com.test6;

public class PatternPrinting {

	public static void main(String[] args) {
		
		int a=0;
		
		for(int i=4;i>=0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
				
	}

}
