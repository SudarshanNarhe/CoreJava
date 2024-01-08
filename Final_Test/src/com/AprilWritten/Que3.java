package com.AprilWritten;

import java.util.ArrayList;

/*3) Write a java program to find the least frequent element in an array?
 * without using any builtin method.[1M]
Input Array : [4, 5, 8, 7, 4, 7, 6, 7]
The least frequent element : 8,6,5
Its frequency : 1
*/

public class Que3 {

	public static void findLeastFrequent(int []num) {
		
		int leastele= num[0];
		int count=count(num, leastele);
		ArrayList<Integer>list = new ArrayList<Integer>();
		for(int i=1;i<num.length;i++) {
			
			int curele = num[i];
			int countcurele=count(num, curele);
			
			if(count>countcurele) {
				leastele=curele;
				count=countcurele;
			}
			if(countcurele==count) {
				list.add(curele);
			}
		}
		System.out.println(list);
		System.out.println("Its Frequency is : "+count);
		
	}
	public static int count(int []num, int target) {
		int count=0;
		
		for(int ele : num) {
			if(ele==target) {
				count++;
			}
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		
		int []num = {4, 5, 8, 7, 4, 7, 6, 7};
		findLeastFrequent(num);
	}
	
}
