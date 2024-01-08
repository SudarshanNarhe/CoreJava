package com.test3;

/*WAP to print maximum in row wise in 2D array. 
Means e.g. arr[][] {{22, 31, 9}, {12, 25, 16}} output is: 31 and 25. */


public class Maximum_Row {

	public static void checkMaximum(int num[][])
	{	
		
		for(int i=0;i<num.length;i++)
		{	int max=0;
			for(int j=0;j<num.length;j++)
				
			if(num[i][j]>max)
			{
				max=num[i][j];
			}
			System.out.println("The maximum of "+(i+1)+" row is :"+max);
		}	
	}
	public static void checkMaximumCOl(int num[][])
	{
		for(int i=0;i<num.length;i++)
		{
			int max=0;
			for(int j=0;j<num.length;j++)
			{
				if(num[j][i]>max)
				{
					max=num[j][i];
				}
				
			}
			System.out.println("Maximum Of Coloumn is : "+max);
		}
	}
	
	public static void main(String[] args) {
		
		int arr[][]= {{22,31,9},{12,25,16}};
		checkMaximum(arr);
		checkMaximumCOl(arr);
	}

}
