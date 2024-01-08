package com.forLoop;

public class BreakContiune {

	static void checkBreak()
	{
		for (int i=0;i<=5;i++)
		{
			//System.out.println(i);
			if(i==3)
			{
				break;
			}
		System.out.println(i);
	}
	}
	static void checkContinue()
	{
		for (int i=0;i<=5;i++)
		{
			if(i==3)
			{
				continue;
			}
		System.out.println(i);
	}
	}
	
	public static void main(String[] args) {
		
		checkBreak();
		//checkContinue();
	}

}
