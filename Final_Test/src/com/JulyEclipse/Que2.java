package com.JulyEclipse;

import java.util.HashMap;
import java.util.Map.Entry;

/*Q2. Display second most frequent character in given String.
 * Eg. Give String is ‘success’ then output should be ‘c’.*/

public class Que2 {
	
	public static void main(String[] args) {
		
		String str="sudarshanans";
		
		char ch[]=str.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<ch.length;i++) {
			
			if(!map.containsKey(ch[i])) {
				map.put(ch[i], 1);
			}
			else {
				int a = map.get(ch[i]);
				map.put(ch[i], a+1);
			}
						
		}
		System.out.println(map);
		int mostfreqcount=0;
		char mostfreqchar=' ';
		
		int secondmostfreqcount=0;
		char secondmostfreqchar=' ';
		
		for(Entry<Character, Integer> en : map.entrySet()) {
			
			if(en.getValue()>mostfreqcount) {
				
				secondmostfreqchar=mostfreqchar;
				secondmostfreqcount=mostfreqcount;
				
				mostfreqcount=en.getValue();
				secondmostfreqchar=en.getKey();
			}
			else if (en.getValue()>secondmostfreqcount && en.getValue()!=mostfreqcount) {
				secondmostfreqchar=en.getKey();
				secondmostfreqcount=en.getValue();
			}
			
		}
		System.out.println("Second most frequncy count is : "+secondmostfreqchar);
		
	}
	
}
