package com.AprilWritten;

/*8)suppose there are 3 bulb continually  on and  off  set the sequence where 3rd blub on first ,
 * then 1st blub on and then 2nd blub[1M]*/

public class Que8 {
	
	public static void onOFFset() {
		
		
		for(int i=0;i<=20;i++) {
		boolean on=true;
		if(on) {
			System.out.println("3");
			on=false;
		}
		if(!on) {
			System.out.println("1");
			on=true;
		}
		if(on)
			System.out.println("2");
	}
}
	
	public static void main(String[] args) {
		
		onOFFset();
		
	}
	
}
