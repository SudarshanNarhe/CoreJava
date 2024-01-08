package com.LinkedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.UnaryOperator;


/*  
 * 4. WAP to remove and return the first element of a linked list. 
 * 5. WAP to retrieve but does not remove, the first element of a linked list. 
 * 6. WAP to retrieve but does not remove, the last element of a linked list. 
 * 7. WAP to check if a particular element exists in a linked list. 
 * 8. WAP to convert a linked list to array list. 
 * 9.   
 * 11. WAP to replace an element in a linkedlist.
 */
public class CloneLinkedList{


	public static void main(String[] args) {
		
		//WAP to clone a linked list to another linkedlist.
		
		LinkedList<Integer> ls= new LinkedList<Integer>();
		ls.add(12);
		ls.add(34);
		ls.add(56);
		ls.add(89);
		ls.add(12);
		Iterator<Integer> itr = ls.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println("\nAfter a Clone : ");
		LinkedList<Integer>ls1= new LinkedList<Integer>();
		ls1=(LinkedList<Integer>) ls.clone();
		
		itr=ls1.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		//WAP to compare two linked lists.
		
		LinkedList<Integer> ls3= new LinkedList<Integer>();
		ls3.add(25);
		ls3.add(16);
		ls3.add(53);
		ls3.add(78);
		ls3.add(67);
		
		System.out.println("\n"+ls.equals(ls1));
		System.out.println(ls.containsAll(ls3));
		
		ls3.set(2, 100);
		System.out.println(ls3);
		
		Object [] arr=ls3.toArray();
		System.out.println(Arrays.toString(arr));
		
		Integer []arr1= new Integer[ls3.size()];
		arr1=ls3.toArray(arr1);
		System.out.println(Arrays.toString(arr1));
		
	}

}
