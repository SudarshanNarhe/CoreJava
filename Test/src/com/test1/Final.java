package com.test1;

public class Final {
	
	public static void main(String[] args) {
		
		B obj2= new B();
		obj2.i=1;
		obj2.j=2;
		A r;  // A r = new B();
		r=obj2;
		r.display();
		
	}
	
	
}


class A
{
	
	int i;
	public void display()
	{
		System.out.println(i);
	}

}

class B extends A
{
	int j;
	public void display()
	{
		System.out.println(j);
	}
	
}
