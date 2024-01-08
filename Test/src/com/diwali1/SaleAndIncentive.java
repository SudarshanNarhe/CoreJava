package com.diwali1;

//The ternary operator is used in the problem (condition : expression : expression;)

public class SaleAndIncentive {

	public static void main(String[] args) {
		
		double sale = 22000;
		double incentive =
				(sale>50000)? sale*0.10:
					(sale>30000)?sale*0.08:
						(sale>1000)?sale*0.05: 0;
		System.out.println("Incentive Earned is : "+incentive);
		
	}
	
	
}
