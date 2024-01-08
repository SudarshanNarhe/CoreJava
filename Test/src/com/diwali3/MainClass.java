package com.diwali3;

interface Que4 {

	void myMethod();
	
}

class ABC {
	
	public void myMethod()
	{
		System.out.println("My Method");
	}
}
class C extends ABC implements Que4
{
	
}
public class MainClass {
	public static void main(String[] args) {
		
		Que4 q = new C();
		q.myMethod();
		
	}
}
