package com.demo;

public class ThreadClassDemo extends Thread{
	
	@Override
	public void run() {
		
		for(int i=1;i<=10;i++) {
//			try {
//			Thread.sleep(1000); // it will execute by slowly according the time
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println(i+ " : "+ getName());
			Thread.yield();  //causes the currently executing thread object to temporarily pause and allow other threads to execute.

		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadClassDemo t1 = new ThreadClassDemo();
		t1.setName("Thread-1"); // to set the thread name
		System.out.println(t1); // it gives thread name priority and method name
		t1.setPriority(MAX_PRIORITY); // to set the priority to give priority for execution
		t1.start(); // to start the thread 
//		t1.join(); // to execute the 1st thread and then another thread
		System.out.println(t1.isAlive());
		
		ThreadClassDemo t2 = new ThreadClassDemo();
		t2.setName("Thread-2");
		System.out.println(t2); // it gives thread name priority and method name
		t2.setPriority(MIN_PRIORITY);
		t2.start();
		System.out.println(t1.isAlive());
	}

}
