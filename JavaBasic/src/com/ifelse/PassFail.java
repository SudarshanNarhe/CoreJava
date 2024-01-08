package com.ifelse;

public class PassFail {

	public static void main(String[] args) {
		float math = 40.8f, phy = 35.8f, chem = 30f,bio = 15.23f, eng =25.4f, prntg;
		prntg = ((math+phy+chem+bio+eng)/500)*100;
		
		System.out.println("You have scored : "+prntg);
		if(prntg>=40)
		{
			System.out.println("Congratulations you are Pass");
		}
		else 
		{
			System.out.println("Sorry you are Fail try again next time");
		}
		
	}

}
