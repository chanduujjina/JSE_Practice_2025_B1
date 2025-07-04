package com.demo.collection.map;

public class SeveriotyTest2 {
	
	public static void main(String[] args) {
	
		
		for (Severity2 severity : Severity2.values()) {
			System.out.println(severity.getVal());
			System.out.println(severity.getDescrption());
			System.out.println(severity.name());
		}
		
	}

}
