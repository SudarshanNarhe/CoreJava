package com.AprilWritten;

/*9)Java Program to Interchange  bottom two Rows & left two Columns in the given Matrix.[1M]
Given Matrix:
1 2 3
4 5 6
7 8 9
Matrix after interchanging row 2 and 3
1 2 3
7 8 9
4 5 6
Matrix after interchanging columns 1 and 2
2 1 3
8 7 9
5 4 6
*/

public class Que9 {
	
	public static void print(int arr[][]) {
			
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void interchange1and3row(int arr[][],int row1,int row2) {
		
		int[] temp = arr[row1];
        arr[row1] = arr[row2];
        arr[row2] = temp;
		
	}
	public static void interchnagingCol1and2(int arr[][],int col1,int col2) {
		
		for(int i=0;i<arr.length;i++) {
			int temp = arr[i][col1];
			arr[i][col1]=arr[i][col2];
			arr[i][col2]=temp;
			
		}
		
	}
	public static void main(String[] args) {
		
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Original matrix : ");
		print(arr);
		System.out.println("Interchnage 1 and 3 rows : ");
		interchange1and3row(arr,1,2);
		print(arr);
		System.out.println("Interchging columns : ");
		interchnagingCol1and2(arr, 0, 1);
		print(arr);
	}
	
}
