package com.demo.collection.map;

public class SeveriotyTest {
	
	public static void main(String[] args) {
		
		String name = Severity.HIGH.name();
		
		//System.out.println(name);
		
		//you can iterate the enum
		
		for (Severity severity : Severity.values()) {
			System.out.println(severity.name());
		}
		
	}

}
