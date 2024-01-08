package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;


//Create arraylist of characters. Remove duplicate characters from the list. 
//E.g. list – { ‘d’ , ‘g’ , ‘h’ , ‘d’ , ‘d’ . ‘h’ , ‘g’}Output should be {‘d’ , ‘g’ , ‘h’}

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		ArrayList<Character>ch = new ArrayList<Character>();
		ch.add('a');
		ch.add('b');
		ch.add('d');
		ch.add('a');
		ch.add('e');
		ch.add('d');
		ch.add('x');
		ch.add('u');
		ch.add('s');
		
		System.out.println(ch);
		
		ArrayList<Character> ch1= new ArrayList<Character>();
		
//		for(char c : ch) {
//			if(!ch1.contains(c)) {
//				ch1.add(c);
//			}		
//		}
//		System.out.println(ch1);
		
		Iterator<Character>itr= ch.iterator();
		while (itr.hasNext()) {
            Character ss = itr.next();
            if (!ch1.contains(ss)) {
                ch1.add(ss);
            }
        }
		System.out.println(ch1);
	}
	
}
