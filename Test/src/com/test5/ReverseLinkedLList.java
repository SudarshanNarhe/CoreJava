package com.test5;

import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedLList {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(11);
		list.add(12);
		list.add(34);
		list.add(54);
		list.add(78);
		list.add(1);
		list.add(4);
		
		System.out.println("Original : "+list);
		
		System.out.print("Reverse : ");
		ListIterator<Integer> itr = list.listIterator(list.size());
		while(itr.hasPrevious()) {
			System.out.print(itr.previous()+" ");
		}
		

	}

}
