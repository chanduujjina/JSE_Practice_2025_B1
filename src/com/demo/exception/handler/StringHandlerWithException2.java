package com.demo.exception.handler;

public class StringHandlerWithException2 {
	
	public static void main(String[] args) {
		
		
		String value  = "chandu 123 test 129 test2 233";
		
		//step 1 split with space
		
		String[] nameArray = value.split(" ");
		
		StringBuffer numberBuffer = new StringBuffer();
		StringBuffer strBuffer = new StringBuffer();
		
		for (String name : nameArray) {
			try {
				int num = Integer.parseInt(name);
				numberBuffer.append(name+ ", ");
			} catch (NumberFormatException e) {
				strBuffer.append(name+ ", ");
			}
		}
		
		System.out.println(numberBuffer);
		System.out.println(strBuffer);
		
		
	
	}

}
