package com.demo.operator;

public class LoopDemo4 {
	
	public static void main(String[] args) {
		
		//print only 1 to 7
		for(int i =1;i<=10;i++) {
			if (i>7) {
				
				break;
			}
			System.out.println(i);
		}
	}

}
