package com.demo.rajasekhar;

public class Assignment2 {
		public static void main(String[] args) {
			
			// 1.Write a program on sum of digits in a number ?
			int a =1234;
			int num_sum = 0;
			while(a>0)
			{
				int temp = a%10;
				num_sum = num_sum + temp;
				a = a/10;
			}
			System.out.println(num_sum);
			
			// 2.Write a program to find Find Missing Number in Array input : int numberArray = {1,2,4,5}_value
			int array1 [] = {1,2,4,5};
			int b = array1[0];
			
			for(int i=0;i<array1.length;i++)
			{
				if (b != array1[i])
				{
					System.out.println(b);
					break;
				}
				b = b + 1;	
			}
			
		//	3.Check the given number is ArmStrong number ?	input Number : 153
			int c = 153;
	        int original = c;
	        int digits = 0;
	        int tempArmstrong = c;

	        while (tempArmstrong > 0) {
	            tempArmstrong /= 10;
	            digits++;
	        }

	        int sum = 0;
	        tempArmstrong = c;
	        while (tempArmstrong > 0) {
	            int digit = tempArmstrong % 10;
	            sum += Math.pow(digit, digits);
	            tempArmstrong /= 10;
	        }

	        if (sum == original) {
	            System.out.println("is an Armstrong number");
	        } else {
	            System.out.println("is not an Armstrong number");
	        }
		
		//	4.Find the Second Largest Element in Array ? input : int numberArray = {3,1,7,2}
			int d []  = {3,1,7,2};
			for(int i=0;i<d.length;i++)
			{
				for(int j =i;j<d.length;j++)
				{
					
					if(d[i] < d[j])
					{
						int temp_var = d[i];
						d[i] = d[j];
						d[j] = temp_var;
						
					}
					
				}
			}
			
			int secondLargestElemnt = d[1];
			System.out.println(secondLargestElemnt);
			
			
			//  5.Find the words in an array start with ch  input : String nameArray = {"chandu","chari","anand","raju"};
			
			String e  [] = {"chandu","chari","anand","raju"};
			for(String word : e)
			{
				if(word.startsWith("ch"))
				{
					System.out.println(word);
				}			
			}
			
			
		//	6.Find the duplicate elements in array ? input 1 : int numberArray = {1,1,2,2,4,5}			output : 1,2

			int f [] = {1,1,2,2,4,5};
			
			for(int i=0;i<f.length;i++)
			{
				for(int j=i+1;j<f.length;j++)
				{
					if(f[i] == f[j])
					{
						System.out.println(f[i]);
						break;
					}
					
				}
			}
			
		//	7.Write a program to split number and String in a word ? input : "test 123 test1 234"
			
			String g  = "test 123 test 1234";
		    String [] words = g.split(" ");
		    
		    for(String word : words)
		    {
		    	if(word.matches(".[a-z]."))
		    	{
		    		System.out.println(word);
		    	}
		    	if(word.matches(".[0-9]."))
		    	{
		    		System.out.println(word);
		    	}
		    }	
			
		}
		
}