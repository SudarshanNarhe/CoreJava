package com.basic;

public class ConvertigDays {

	public static void main(String[] args) {
		float day, week, yrs, month;
		day = 200f;
		week = (float)(day/7);
		yrs = (float)(day/365);
		month = (float)(day/30);
		System.out.println("The week is :"+week);
		System.out.println("The years is :"+yrs);
		System.out.println("The month is :"+month);

	}

}
