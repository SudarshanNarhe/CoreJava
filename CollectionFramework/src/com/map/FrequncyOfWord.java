package com.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class FrequncyOfWord {

	public static void main(String[] args) {
		
		String str="Java is a Object Oriented Language and also it is a robost Language";
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		String []words=str.split(" ");
		
		System.out.println(Arrays.toString(words));
		
		System.out.println("---------------------------------");

		for(String s : words) {
			if(map.containsKey(s)) {
				int a =map.get(s);
				map.put(s, a=a+1);
			}
			else {
				map.put(s, 1);
			}
		}
		
		Set<String> ss= map.keySet();
		Iterator<String> itr1 =ss.iterator();
		while(itr1.hasNext()) {
			String s = itr1.next();
			System.out.print(s+"  ");
			System.out.println(map.get(s));
			System.out.println("---------------------------------");
		}
	}

}
