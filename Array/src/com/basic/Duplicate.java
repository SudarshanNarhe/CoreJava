package com.basic;

public class Duplicate {

	public static void duplicate(int num[])
	{
		System.out.println("The duplicate numbers is : ");
		int count=0; 
		for(int i=0;i<num.length;i++)
		{
			boolean isDuplicate = false; // Assume its false...
			
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]==num[j])
				{
					count++;
					isDuplicate=true;
					break;  		   // break out from loop once we got a duplicate 
				}
			}
					// check if number has not been printed has before 
									//i.e. the number will not repeat again and its not count again...
			if(isDuplicate)	
			{
				boolean notPrint = true;
			
				for(int k=i-1;k>=0;k--)
				{
					if(num[i]==num[k])
					{
						notPrint=false;
						break;
					}
				}
				if(notPrint)
				{
					System.out.println(num[i]);
				}
			}
		}
		System.out.println("Count is : "+count);
	}
	
	public static void main(String[] args) {
		
		int arr[]= {2,3,1,3,2,4,1};
		duplicate(arr);
		
		
		
	}

}
