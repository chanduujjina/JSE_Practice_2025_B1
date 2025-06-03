package com.demo.stringhandler;

public class CompareToEqualDemo {
	
	public static void main(String[] args) {
		
		String name1 = "chandu";
		
		String name2 ="Abhi";
		
		boolean isEquals = name1.equals(name2);//it will the compare the content
		
		System.out.println("name1.equlas(name2) is "+isEquals);
		
		int compareTwoValues1 = compareTwoValues("chandu","abhi");
		
		System.out.println("comparing name 1 and name 2::"+compareTwoValues1);
		
        int compareTwoValues2 = compareTwoValues("chandu","rajendra");
		
		System.out.println("comparing name 1 and name 2::"+compareTwoValues2);
		
		    int compareTwoValues3 = compareTwoValues("chandu","chandu");
			
			System.out.println("comparing name 1 and name 2::"+compareTwoValues3);
	}
	
	private static int compareTwoValues(String input1,String input2) {
		return input1.compareTo(input2);
	}

}
