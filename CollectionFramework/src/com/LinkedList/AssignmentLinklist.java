package com.LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class AssignmentLinklist {

	public static void main(String[] args) {
		
		LinkedList<Integer> a = new LinkedList<Integer>();
		a.add(12);
		a.add(32);
		a.add(12);
		a.add(43);
		a.add(98);
	
		Iterator<Integer> itr = a.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		//WAP to append the specified element to the end of a linked list.
		// WAP to iterate through all elements in a linked list.
		a.addLast(78);
		System.out.println("\nAfter a append : ");
		itr=a.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		//Using ListIterator
		System.out.println("\nUsing list Iterator : ");
		ListIterator<Integer>ls=a.listIterator();
		while(ls.hasNext()) {
			System.out.print(ls.next()+" ");
		}
		//WAP to iterate through all elements in a linked list starting at the specified position.
		System.out.println("\nWith Specific position : ");
		for(int i=1;i<a.size();i++) {
			System.out.print(a.get(i)+" ");
		}
		//WAP to iterate a linked list in reverse order.
		System.out.println("\nBy Descending Order : ");
		itr=a.iterator();
		itr=a.descendingIterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		//WAP to insert the specified element at the specified position in the linked list.
		a.add(2, 121);
		System.out.println("\nAdd Elements on specific position : ");
		for(int b : a) {
			System.out.print(b+" ");
		}
		// WAP to insert elements into the linked list at the first and last position.
		System.out.println("\nAdd On first and Last position : ");
		a.add(0, 512);
		//a.addFirst(512);
		a.add(a.size(), 612);
		//a.addLast(612);
		for(int m : a) {
			System.out.print(m+" ");
		}
		
		//WAP to get the first and last occurrence of the specified elements in a linked list.
		System.out.println("\nFirst Occurance : ");
		System.out.println(a.indexOf(12));
		System.out.println("Last Occurance : ");
		System.out.println(a.lastIndexOf(12));
		
		//By Logic ...
		System.out.println("By Logic : ");
		int first=0;
		int last=0;
		int count=0;
		
		for(int i=0;i<a.size();i++) {
				if(a.get(i)==12) {
					count++;
					if(count==1)
						first=i;
					else
						last=i;
				}
				
		}
		System.out.println("First Occurance is : "+first);
		System.out.println("Last Occurance is : "+last);
		
		// WAP to display the elements and their positions in a linked list.
		System.out.println("Dislay with index : ");
		for(int i=0;i<a.size();i++) {
			System.out.println("index : "+i+"element : "+a.get(i));
		}
		// WAP to remove a specified element from a linked list.
		
		//Shuffle the elements : 
		System.out.println("Before Shuffle : ");
		for(int w : a) {
			System.out.print(w+" ");
		}
		System.out.println("\nAfter Shuffle : ");
		Collections.shuffle(a);
		for(int k : a) {
			System.out.print(k+" ");
		}
		
		//Join two LinkedList...
		LinkedList<Integer> b=new LinkedList<Integer>();
		b.add(90);
		b.add(91);
		b.add(92);
		b.add(93);
		System.out.println("\nAdding two Lists : ");
		a.addAll(b);
		for(int r : a) {
			System.out.print(r+" ");
		}
		System.out.println("\nChecking list is empty or not : "+a.isEmpty());
		
	}

}
