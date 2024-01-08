package com.containment;

public class AccountMain {

	
	
	public static void main(String[] args) {
		
		//array of account object 
		Account accArr[]=new Account [3];
		accArr[0]=new Account(201, 25000, "Prashant");
		accArr[1]=new Account(302, 12308, "Maruti");
		accArr[2]=new Account(545, 16612, "Sudarshan");
		
//		for(int i=0;i<accArr.length;i++)
//		{
//			System.out.println(accArr[i]);
//		}
		
		//OR
		
		for(Account a:accArr)
			System.out.println(a);
		
		double max=0;
		String name=" ";
		
		for (Account a1:accArr)
		{
			if(a1.getBalance()>max)
			{
				max=a1.getBalance();
				name=a1.getName();
			}
		}
		System.out.println("\n"+name+" having a maximum balance Rs : "+max);

	}

}
