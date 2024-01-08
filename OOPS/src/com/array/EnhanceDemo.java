package com.array;

public class EnhanceDemo {
	
	int arr[];
	
	public EnhanceDemo()
	{
		arr=new int [5];
		for (int i=0;i<arr.length;i++)
			arr[i]=i;         //i=0,1,2,3,4
	}
	public EnhanceDemo(int abc[])
	{
		arr=abc;
	}
	public int addArrayElement()
	{
		int sum=0;
		for(int i: arr)
		{
			sum+=i;
		}
		return sum;
	}
	//return array from method
	public int[]reverse()
	{
		int xyz[]=new int [arr.length];
		int j=arr.length-1;
		for(int i=0;i<xyz.length;i++)
		{
			xyz[i]=arr[j];
			j--;
		}
		return xyz;
	}
	
	public void display()
	{
		
	}
	public static void main(String[] args) {
		
		EnhanceDemo obj=new EnhanceDemo();
		System.out.println(obj.addArrayElement());
		int objArr[]= {5,6,7,8,3};
		EnhanceDemo obj1=new EnhanceDemo(objArr);
		System.out.println(obj1.addArrayElement());
		int result[]=obj1.reverse();
		
		for(int i:result)
			System.out.println(i);
	
				
		

	}

}
