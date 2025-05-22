package com.demo;

public class LoopDemo3 {
	
	public static void main(String[] args) {
		
		//print only 1 to 10 but skip 9
		for(int i =1;i<=10;i++) {// i =1.....8,9,10
			
			if (i == 9) {
				continue;
			}
			
			System.out.println(i);
		}
	}

}
