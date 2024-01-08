package com.ternary;

public class Voting {

	public static void main(String[] args) {
		int age =18;
		
//		boolean status;
//		  if (age>=18)
//		  {
//			  status=true;
//		  }
//		  else
//		  {
//			  status=false;
//		  }
		  boolean status=(age>=18)?true:false;
		  System.out.println(status);
		  
		  System.out.println((age>=18)?"You can vote":"You cannot vote");
		  
		  //(age>=18)?System.out.println("can vote"): System.out.println("cannot vote");
			  
	}

}
