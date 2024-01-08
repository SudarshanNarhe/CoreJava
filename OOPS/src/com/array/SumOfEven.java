package com.array;

public class SumOfEven {
	
	static int arr[]= {1,2,3,4,5};
	
	SumOfEven()
	{
		for(int i=0;i<arr.length;i++)
			arr[i]=i;
	}
	public int addSum(int obj[])
	{
		int sum=0;
		for (int i:arr)
		{
			if(i%2==0)
			{
				sum+=i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		SumOfEven obj=new SumOfEven();
		int result=obj.addSum(arr);
		System.out.println("The Sum of even number is : "+result);

	}

}
