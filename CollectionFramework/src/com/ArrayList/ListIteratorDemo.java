package com.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		List<Integer> list= Arrays.asList(3,4,5,2,2,1,8,6);
		ListIterator<Integer> itr= list.listIterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
			
		}
		System.out.println();
		itr=list.listIterator(list.size());
		while(itr.hasPrevious()) {
			System.out.print(itr.previous()+" ");
		}
	}
	
}
