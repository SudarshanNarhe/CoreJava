package com.basic;

public class CompundInterest {

	public static void main(String[] args) {
		float p, r, t;
		double ci;
		p = 60f;
		r = 18;
		t = 3;
		//ci=(p*(1+(r / 100))^t – p);
		ci=p * (Math.pow((1 + r / 100), t)) - p;
		//ci = p(1+r)*(Math.pow((1+r),t));
		System.out.println("The Compund interest is :"+ci);

	}

}
