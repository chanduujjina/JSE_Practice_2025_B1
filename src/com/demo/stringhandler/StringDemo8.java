package com.demo.stringhandler;

public class StringDemo8 {
	
	public static void main(String[] args) {
		
		String name = "chandrasekhar";
		
		//find the second ocuurance of a charcter
		
		getOccuranceOfChar(name,'h',2);
		
		getOccuranceOfChar(name,'r',2);
		
		getOccuranceOfChar(name,'a',2);
		
		
		
	}

	private static void getOccuranceOfChar(String name,char inputChar,int inputNumber) {
		char[] charArray = name.toCharArray();
		
		
		
		int count =0;//1,2
		for (int i =0 ;i<charArray.length;i++) {//0,1,2,3
			if (charArray[i] == inputChar) {
				count++;
			}
			
			if (count == inputNumber) {
				
				System.out.println(inputChar+" "+inputNumber+ " ocurrance "+i);
				break;
			}
		}
	}

}
