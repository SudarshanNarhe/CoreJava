package com.exception;

public class Basic {
	
	// We can add a exception handling method in method also or and a main method also...
	
	public static void arraySum(int num[])
	{
		int sum=0;
		for(int i=0;i<=num.length;i++)
		{
			sum+=num[i];
		}
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("In main Before...");
		int num[]= {1,2,3,4,5,6,7,8,9};
		
		//Basic obj = new Basic();
		
		
		try {
		
			arraySum(num);
		}
//		catch (ArrayIndexOutOfBoundsException e) 
//		{
//			e.printStackTrace();
//		}
//		catch (NullPointerException e)
//		{
//			e.printStackTrace();
//		}
		// we can add like a these also...
		catch (ArrayIndexOutOfBoundsException | NullPointerException e)
		{
			e.printStackTrace();
		}
		catch (Exception e)    		 // its a sub class of Throwable so it should be before its super class 
		{							// its collect the exceptions which we don't know
			e.printStackTrace();
		}
		catch (Throwable e)			// its a super class so we have add after its subclass...
		{
			e.printStackTrace();
		}
		finally						// its run bydefault when we call garbage collector when there is null value.
		{
			System.out.println("I am in the final ");
		}
		
		System.out.println("In main After...");
		
		System.gc();
		
	}

}
