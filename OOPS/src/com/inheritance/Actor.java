package com.inheritance;

/*WAP to create class Person with method readScript().
create class Actor which extends Person implement readScript() differently in child.*/

public class Actor extends Person
{
	
	public Actor()
	{
		
	}
	@Override
	public void readScript()
	{
		super.readScript();
	}
	public static void main (String []args)
	{
		Person obj = new Actor();
		obj.readScript();
				
	}
	
}