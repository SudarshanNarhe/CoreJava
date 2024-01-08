package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class FrequncyOfMap {

	public static void main(String[] args) {
		
		String str = "sudarshan";
		
		HashMap<Character, Integer> map= new HashMap<Character, Integer>();
		
		char [] ch= str.toCharArray();
		for(char c : ch) {
			if(map.containsKey(c)) {
				int a=map.get(c);
				map.put(c, a+=1); // OR ------>> map.get(c)+1
			}
			else
				map.put(c, 1);
		}
		
		Set<Character> set=map.keySet();
		Iterator<Character> itr1 =set.iterator();
		while(itr1.hasNext()) {
			Character s = itr1.next();
			System.out.print(s+"  ");
			System.out.println(map.get(s));
			System.out.println("---------------------------------");
		}

	}

}
