package com.test4;

public class Que13PredictOutput {
	
	int count =0;
	
	void A()throws Exception {
		
		try {
			count++;
			try {
				count++;
				try {
					count++;
					throw new Exception();
				}
				catch (Exception e) {
					count++;
					throw new Exception();
				}
			}
			catch(Exception e) {
				count++;
			}
		}
		catch(Exception e) {
			count++;
		}
	}
	void display() {
		System.out.println(count);
	}
	public static void main(String[] args) throws Exception {
		
		Que13PredictOutput obj = new Que13PredictOutput();
		obj.A();
		obj.display();
		
	}

}
