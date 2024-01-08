package com.test3;

/*Write a java program to remove duplicate elements from an array?[1M]

Array With Duplicates : [4, 3, 2, 4, 9, 2]
Array Without Duplicates : [4, 3, 2, 9]    */


public class RemoveDuplicate {

	public static void removeDuplicate(int num[])
	{
		
		
		for(int i=0;i<num.length;i++)
		{	boolean status = false;
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]==num[j])
				{
					status = true;
					break;
				}
			}
			if(status)	
			{	boolean print =true;
				for(int k=i-1;k>=0;k--)
				{
					if(num[i]==num[k])
					{
	
						print=false;
						break;
					}
				}
				if(print)
				{
					System.out.print(num[i]+" ");
				}

			}
			
		}
		
	}
	
	public static void main(String[] args) {
	
		int arr[]= {4, 3, 2, 4, 9, 2};
		removeDuplicate(arr);
		

	}

}
