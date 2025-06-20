package com.demo.exception.handler;

public class StringHandlerWithException {
	
	public static void main(String[] args) {
		
		
		String value  = "chandu 123 test 129 test2 233";
		
		//step 1 split with space
		
		String[] nameArray = value.split(" ");
		String [] stroutputArray = new String[3];
		int [] numberoutputArray = new int[3];
		int trycount = 0;
		int catchcount = 0; 
		
		for (int i = 0;i<nameArray.length;i++) {
			
			try {
				int num = Integer.parseInt(nameArray[i]);
				numberoutputArray[trycount] = num;
				trycount++;
			} catch (NumberFormatException e) {
				stroutputArray[catchcount] = nameArray[i];
				catchcount++;
			}
			
		}
		
		for (String val : stroutputArray) {
			
			System.out.print(val+" ");
		}
		
		System.out.println();
		
           for (int num : numberoutputArray) {
			
			System.out.print(num+ " ");
		}
	
	
	}

}
