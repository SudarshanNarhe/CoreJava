package com.oops;

public class IdentifyAccount extends DefaultAccount{
	
	public IdentifyAccount() {
		
	}

	public static void main(String[] args) {
		
		DefaultAccount obj[] = new DefaultAccount[3];
		obj[0]= new DefaultAccount();
		obj[1]= new SavingAccount();
		obj[2]= new CurrentAccount();
		
		for(int  i=0;i<obj.length;i++)
		{
			if(obj[i]instanceof SavingAccount)
			{
				System.out.println("Saving Account");
				System.out.println(obj[i].rateOfInterest());
			}
			else if(obj[i]instanceof CurrentAccount)
			{
				System.out.println("Current Account");
				System.out.println(obj[i].rateOfInterest());
			}
			else
			{
				System.out.println("Default Account");
				System.out.println(obj[i].rateOfInterest());
			}
		}
		
		
	}

}
