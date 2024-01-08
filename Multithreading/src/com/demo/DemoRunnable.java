package com.demo;

public class DemoRunnable implements Runnable {

	@Override
	public void run() {
		
		for(int i=1;i<=10;i++) {
			System.out.println(i+ " : "+Thread.currentThread().getName());
		}
		
	}
	public static void main(String[] args) {
		/*
		 * to run a code we required pass the object to thread class bcs runnable interface only have run method 
		 * */
		Runnable r = new DemoRunnable();
		Thread t1 = new Thread(r,"ping");  
		t1.start(); 
		
		// By Anyminous object 
		Thread t2 = new Thread(new DemoRunnable(),"pong");
		t2.start();
		
	}

}
