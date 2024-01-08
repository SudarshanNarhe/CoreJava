package com.exception;

//WAP to show checked exception and use multiple catch block with universal Exception handler
//WAP where only try and finally is used

public class UniversalExceptionHandler implements Cloneable{
	
	public static void showArray(int num[]) {
		
		for(int i=0;i<=num.length;i++) {
			System.out.println(num[i]);
		}
	}
	public void division(int n, int m) {
		
		int c= n/m;
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6};
		UniversalExceptionHandler obj = new UniversalExceptionHandler();
		// once jvm gots a exception in try it will never go forward it comes out from the catch block
		try {
			System.out.println("Before -->>In Clone try");
		System.out.println(obj.clone());
		obj.division(10, 0);
		System.out.println("After -->>In Clone try");
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println("Before -->>In Array try");
			showArray(arr);
			System.out.println("After -->>In Array try");
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("I am in Finally");
		}
		System.out.println("Programm Continues...");
	}
}
