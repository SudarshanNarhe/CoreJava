package com._2D_Array;

/*WAP to check if a matrix is a Sparse matrix (in which most of the elements are 0). 
Print “Sparse” if it is Sparse else print “Not sparse”*/


public class Sparse {

	public static void sparse(int num[][])
	{
		int count =0;
		int count_element=0;
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num[i].length;j++)
			{
				count_element++;
				if(num[i][j]==0)
					count++;
				
			}
		}
		System.out.println("Number of Zero Element is : "+count);
		System.out.println("Total number of Elements : "+count_element); 
		
		if(count>(count_element/2))
			System.out.println("Sparse Matrix");
		else
			System.out.println("Not a Sparse Matrix");
	}
	
	public static void main(String[] args) {
		
		int arr[][]= {{1,0,0,5},{0,0,0,5},{3,0,0,1},{0,0,3,0}};
		
		sparse(arr);

	}

}
