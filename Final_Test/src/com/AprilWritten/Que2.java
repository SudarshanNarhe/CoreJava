package com.AprilWritten;

import java.util.ArrayList;

/*2) How to remove  Characters from the first String which are present in the second String 
 * and add deleted Characters in the ArrayList.[1M]
e.g String1->india is great nation.
string2-in
output->da s great 
ArrayList [i,n,i,i,n,i]
*/

public class Que2 {

	public static void removeCharacters(String str1,String str2) {
		
		char [] ch1= str1.toCharArray();
		char [] ch2= str2.toCharArray();
		ArrayList<Character> chlist= new ArrayList<Character>();  
		for(int i=0;i<ch1.length;i++) {
			
			for(int j=0;j<ch2.length;j++) {
				if(ch1[i]==ch2[j]) {
					chlist.add(ch1[i]);
					ch1[i]='#';
				}
				
			}
		}
		
		String newstr= new String();
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]!='#') {
				newstr=newstr+ch1[i];
			}
		}
		System.out.println(newstr);
		
		System.out.println(chlist);
	}
	
	public static void main(String[] args) {
		
		String str= "india is great nation";
		String str1= "in";
		
		removeCharacters(str, str1);
		
	}
	
}
