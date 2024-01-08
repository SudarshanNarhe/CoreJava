package com.test4;

//Predict the Output...

public class Que11PredictOutput {

	public static void main(String[] args) {
		
		try
		{
			System.out.printf("1");
			int data = 5/0;
			System.out.println(data);
		}
		catch (ArithmeticException e) {
			Throwable obj = new Throwable("Sample");
			try
			{
				throw obj;
			}
			catch(Throwable e1)
			{
				System.out.printf("8");
			}
		}
		finally
		{
			System.out.printf("3");
		}
		System.out.printf("4");
	}

}
