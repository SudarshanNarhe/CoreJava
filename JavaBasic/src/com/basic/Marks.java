package com.basic;

public class Marks {

	public static void main(String[] args) {
		float eng,math,phy,chem,bio,total,avg,prntg;
		eng = 78;
		math = 79;
		phy = 83;
		chem = 74;
		bio = 67;
		total = eng+math+phy+chem+bio;
		avg = (eng+math+phy+chem+bio)/5;
		prntg =(float)(eng+math+phy+chem+bio)/500*100;
		System.out.println("The total marks is :"+total);
		System.out.println("The avg of marks is :"+avg);
		System.out.println("The percentage is :"+prntg);

	}

}
