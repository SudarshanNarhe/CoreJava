package com.numbers;

public class BlockNumwithDiagonal {

	public static void main(String[] args) {
		    int n=6;
		    for (int i=1; i<=n;i++)
		    {
		    	for (int j=1;j<=n;j++)
		    	{
		    		if(j==i)
		    		{
		    			System.out.print(j-1+" ");
		    		}
		    		else
		    		System.out.print("0 ");
		    	}
		    	System.out.println();
		    }

	}

}
