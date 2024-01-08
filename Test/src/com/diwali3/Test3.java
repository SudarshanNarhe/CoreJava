package com.diwali3;
// to avoid the warnings we change the calling method by its classname...
public class Test3 {

	static int x = 10;
	public static void main(String[] args)
	{
		//Test3 t1 = new Test3();
		//Test3 t2 = new Test3();
		Test3.x = 20;
		Test3.x = 21;
		Test3.x=34;
		
		System.out.print(Test3.x + " ");
		System.out.println(Test3.x);
	}
}
