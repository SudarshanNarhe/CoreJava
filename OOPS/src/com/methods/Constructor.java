package com.methods;

public class Constructor {
	
	int i,j,k, sum;
	
	public Constructor()
	{
		i=12;
		j=11;
		k=30;
		System.out.println("I am a defualt constructor "+i+j+k);
	}
	public Constructor (int i, int j, int k)
	{
		int a= i+j+k;
		System.out.println("I am parametrized Constructor : "+a);
	}
	public void sum(int a, int b,int c)
	{
		sum=a+b+c;
	}
    public void display()
    {
    	System.out.println("Sum is "+sum);
    }
	
	public static void main(String[] args) {
		
		//Constructor bjp=new Constructor();
		Constructor obj= new Constructor(5,6,8);
		
		obj.display();
	}

}
