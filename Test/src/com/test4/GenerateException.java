package com.test4;


class Parent1 {
	
	
	
}
public class GenerateException extends Parent1{
	
	public void show(String s) {
		System.out.println(s.length());
	}
	
	public static void main(String[] args) {
		try
		{
		GenerateException o = new GenerateException();
		o.show(null);
		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());	
		}
		GenerateException obj = (GenerateException) new Parent1();
		obj.show(null);
	}

}
