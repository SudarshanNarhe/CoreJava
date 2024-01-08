package com.AprilWritten;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/*22)  There is array of int of any size find the factor of each element and  
 * store that element and its factor into appropriate collection.[1M]*/

public class Que22 {
		
	public static void main(String[] args) {
		
		int [] arr = {12,34,56,78,97,10};
		
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		
		for(int i=0;i<arr.length;i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int j=1;j<=arr[i];j++) {
				
			if(arr[i]%j==0) {
				list.add(j);
			}
			map.put(arr[i], list);
		  }
				
		}
		
		Iterator<Entry<Integer, ArrayList<Integer>>> entry=map.entrySet().iterator();
		while(entry.hasNext()) {
			
			Entry<Integer, ArrayList<Integer>> en=entry.next();
			
			System.out.println("Number : "+en.getKey()+" , Factors : "+en.getValue());
			
		}
	}
	
}
