package com.NovEclipse;

/*Q3.Accept String from user and display it in forllong pattern.
E.g.  String Entered is  “Hello” then String in following pattern should be displayed		    [1]
       H
      eHe
     leHel
    lleHell
   olleHello
*/

public class Que3 {
	
	public static void main(String[] args) {
		
		String str="Hello";
		char [] ch= str.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			
			for(int j=1;j<=ch.length-i;j++) {
				System.out.print(" ");
			}
			
			for(int k=i;k>=0;k--) {
				System.out.print(ch[k]);
			}
			for(int j=1;j<=i;j++) {
				System.out.print(ch[j]);
			}
			for(int j=1;j<=ch.length-i;j++) {
				System.out.print(" ");
			}
			System.out.println();
			
		}
		
	}
	
}
