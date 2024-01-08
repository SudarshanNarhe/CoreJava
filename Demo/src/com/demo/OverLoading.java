package com.demo;


class P{
	
	
}
class Q extends P{
	
}

public class OverLoading {
	
	public static void show(P p) {
		System.out.println("p");
	}
	public static void show(Q q) {
		System.out.println("q");
	}
	public static void main(String[] args) {
		
		show(null);
	}

}
