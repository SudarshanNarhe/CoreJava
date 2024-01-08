package com.basic;

public class Unique {
	
	/*
	 * The following logic has some drawbacks so using duplicate logic is much better than it
	 * if the user enter same value to ascii value then it will give wrong output...
	 */
	
	public static void unique(int num[])
	{
		int count;
		System.out.println("The unique Elements are : ");
		for(int i=0;i<num.length;i++)
		{
			if(num[i]=='$')
				continue;
			count=1;
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]==num[j])
				{
					count++;
					num[j]='$';
				}
			}
			if(count==1)
			{
				System.out.println(num[i]+" ");
			}
		}
	}
				
	public static void main(String[] args) {
		
		int arr[]= {1,2,2,3,1,2,4,5,8};
		unique(arr);
		
	}

}
