package com.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueCreation {

	public static void main(String[] args) {
		
		 Queue<Integer> num=new PriorityQueue<Integer>();
		 num.add(23);
		 num.add(101);
		 num.add(-21);
		 num.add(67);
		 num.add(82);
		 num.add(11);
		 
		 System.out.println(num);
		
		 System.out.println("Used of poll : "+num.poll());
		 System.out.println(num);
		 System.out.println("Used of Remove : "+num.remove());
		 System.out.println(num);
//		 System.out.println("Used of Remove : "+num.remove());
//		 System.out.println(num);
		 
		 System.out.println("Used of Iterator : ");
		 Iterator<Integer> itr = num.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 
		 System.out.println("Offer : "+num.offer(821));
		 System.out.println(num);
		 
		 System.out.println("Element : "+num.element());
		 System.out.println(num);
		 
		 System.out.println("Peek : "+num.peek());
		 System.out.println(num);
	}

}
