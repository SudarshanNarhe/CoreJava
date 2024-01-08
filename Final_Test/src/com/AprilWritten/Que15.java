package com.AprilWritten;

//16) find the output[1M]

public class Que15 {
	
	public static void main(String[] args) {

		Thread t = new Exam() {
			
			@Override
			public void run() {
				System.out.println(" foo");
			}
		};
		t.start();
	}
	
}


class Exam extends Thread {
	Exam() {
		System.out.print(" MyThread");
	}

	public void run() {
		System.out.print(" bar");
	}

	public void run(String s) {
		System.out.println(" baz");
	}

}

