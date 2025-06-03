package com.demo;

public class Assignment01 {
	
	
	public static void main(String[] args) {
		
			// find a factorial of 5
				int n1=5;
				int sum = 1;
				for(int i=1;i<=n1;i++)
				{
					sum = sum * i;
				}
				System.out.println(sum);
				
			
		System.out.println("\n\nFind the factors of the given input 56");
			// Find the factors of the given input 56
				int n2 = 56;
				for(int i=1;i<=n2;i++)
				{
					if(n2%i == 0)
					{
						System.out.println(i);
					}
					
				}

				
		System.out.println("\n\nWrite a program to reverse a number 543");
			// Write a program to reverse a number 543
		       int n3 = 543;
		       int temp;
		       int reverse=0;
		       while(n3>0) 
		       {
		    	   temp = n3%10;
		    	   reverse = reverse * 10 + temp;
		    	   
		    	   n3 = n3 /10;
		    	   
		       }
			System.out.println(reverse);
				
			
		System.out.println("\n\nWrite a program on fibonnaci series");
		// write a program on fibonnaci series
		int numb = 5;
		int a =0;
		int b=1;
		int temp1;
		for(int i=0;i<5;i++)
		{
			temp1 = a + b ;
			System.out.println(a);
			a = b;
			b = temp1;
		}	
		
	}
		
	
}
