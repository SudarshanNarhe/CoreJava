package com.test3;

/*Write  a  java  program  to  find  all  pairs  of  elements  in  an  integer  array  
whose  sum  is  equal to a given number? */

public class Pair {

	public static void main(String[] args) {
		
		int arr[]= {4,6,5,-10,8,5,20};
		int sum=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				sum=arr[i]+arr[j];
				if(sum==10)
				{
					System.out.println(arr[i] +"+" +arr[j] +"="+sum);
				}
			}
		}

	}

}
