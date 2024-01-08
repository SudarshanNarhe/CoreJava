package com.AprilWritten;

/*4) print the patteren[1M]
       A
      CBA
  	 EDCBA
	GFEDCBA
*/

public class Que4 {

	public static void main(String[] args) {
		char ch='A';
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=(4-i);j++) {
				System.out.print(" ");
			}
			for(int j=(2*i-1);j>=1;j--) {
				System.out.print((char)(ch+(j-1)));
			}
			System.out.println();
		}
		
	}
	
}
