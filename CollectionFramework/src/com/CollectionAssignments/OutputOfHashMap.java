package com.CollectionAssignments;

import java.util.HashMap;

public class OutputOfHashMap {

	public static void main(String[] args) {
		
		//What will be output of following program.
		
		HashMap obj = new HashMap();
		obj.put("A", new Integer(1));
		obj.put("B", new Integer(2));
		obj.put("A", new Integer(4));
		obj.put("C", new Integer(3));
		System.out.println(obj);
		
	}
	
}
