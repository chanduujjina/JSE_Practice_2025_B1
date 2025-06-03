package com.demo.operator;

public class InfiniteLoopDemo1 {
	
	public static void main(String[] args) {
		
		int a = 10;
		
		int b =10;
		
		while(a == b) {
			System.out.println("inside while loop");
		}
	}

}
