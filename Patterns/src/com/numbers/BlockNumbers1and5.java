package com.numbers;

public class BlockNumbers1and5 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{	
			for(int j=1;j<=n;j++)
			 {                                                
				 if ((i==2)&&(j>=4))
				System.out.print("2 ");
				        
				else if ((i==3)&&(j>=3))
					System.out.print("3 ");
				          
				else if ((i==4)&&(j>=2))
					System.out.print("4 ");
				
				else if ((i==5)&&(j>=1))
					System.out.print("5 ");
				      
				else 
					System.out.print("1 ");
				
				 	
			}
			System.out.println();
		}

	}
		
}

