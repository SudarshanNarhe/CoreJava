package com.Array;

public class Pattern {

	public static void main(String[] args) {
		
		char arr[][]= new char [3][3];
		arr[0][0]= '*';
		arr[0][1]= '*';
		arr[0][2]= '*';
		arr[1][0]= '*';
		arr[1][1]= '*';
		arr[1][2]= '*';
		arr[2][0]= '*';
		arr[2][1]= '*';
		arr[2][2]= '*';
		
		for(char ch[] : arr) {
			for(char ch1 : ch)
			{
				System.out.print(ch1+" ");
			}
		System.out.println();
		}

	}

}
