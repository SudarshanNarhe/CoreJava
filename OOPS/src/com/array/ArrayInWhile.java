package com.array;

public class ArrayInWhile {

	public void ArrayCreation()
	{
		int arr[]= {1,2,3,4,5,6};
		this.display(arr);
		
	}
	public void display(int obj[])
	{	
		int i=0;
		while(i<obj.length)
		{
			System.out.println(obj[i]);
			i++;
		}
	}
	
	public static void main(String[] args) {
		ArrayInWhile a =new ArrayInWhile();
		a.ArrayCreation();
		

	}

}
