package com._2D_Array;

/*WAP to print maximum in rowwise in 2D array. Means
e.g. arr[][] = {{22, 31, 9}, {12, 25, 16}}
output is: 31 and 25.*/


public class MaximunAndMininum {

	public static void maxOfRow(int num[][])
	{
		for(int i=0;i<num.length;i++)
		{
			int max =num[i][0];
			for(int j=0;j<num[i].length;j++)
			{
				if(num[i][j]>max)
				{
					max= num[i][j];
				}
			}
			System.out.println("The maximum of "+(i+1)+" element is :  "+max);
		}
	}
	public static void minOfRow(int num[][])
	{
		for(int i=0;i<num.length;i++)
		{
			int min =num[i][0];
			for(int j=0;j<num[i].length;j++)
			{
				if(num[i][j]<min)
				{
					min= num[i][j];
				}
			}
			System.out.println("The minimum of "+(i+1)+" element is :  "+min);
		}
	}
	public static void maxOfCol(int num[][])
	{
		
		for(int i=0;i<num.length;i++)
		{
			int  max =num[0][i];
			
			for(int j=0;j<num[i].length;j++)
			{
				
				if(num[j][i]>max)
				{
					max= num[j][i];
				}
			}
			System.out.println("The maximum of coloumn is :  "+max);
			
		}
	}
	public static void minOfCol(int num[][])
	{
		
		for(int i=0;i<num.length;i++)
		{
			int  min =num[0][i];
			
			for(int j=0;j<num[i].length;j++)
			{
				
				if(num[j][i]<min)
				{
					min= num[j][i];
				}
			}
			System.out.println("The minimum of coloumn is :  "+min);
			
		}
	}
	public static void main(String[] args) {
		
		int arr[][] = {{22, 31, 9}, {12, 25, 16},{1,32,6}};
		//maxOfRow(arr);
		//minOfRow(arr);
		maxOfCol(arr);
		System.out.println("_________________________________-");
		minOfCol(arr);
	}

}
